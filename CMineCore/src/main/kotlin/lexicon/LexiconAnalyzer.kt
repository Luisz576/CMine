package com.cmine.lexicon

import com.cmine.lexicon.exception.InvalidFileException
import com.cmine.lexicon.expression.ExpressionBuilder
import com.cmine.lexicon.expression.ReadingType
import com.cmine.symbol_table.SymbolTable
import com.cmine.symbol_table.exception.InvalidSymbolException
import com.cmine.token.Token
import com.cmine.token.exception.InvalidTokenException
import com.cmine.token.token_identifier.TokenIdentifier
import token.exception.TextNotClosedException
import java.io.BufferedReader
import java.io.File
import java.io.IOException
import java.util.ArrayList

class LexiconAnalyzer{
    private val tokensAux = ArrayList<Token>()
    private val expression = ExpressionBuilder()
    private var currentLine = 1
    private var currentColumn = 0

    @Throws(InvalidFileException::class, InvalidTokenException::class)
    fun analyzeFromFile(filePath: String) : List<Token> {
        val file = File(filePath)
        if(!file.exists()){
            throw InvalidFileException(filePath, "File not exists")
        }
        try{
            val buffer = BufferedReader(file.reader())
            val r = analyze(buffer)
            buffer.close()
            return r
        }catch (e: IOException){
            throw InvalidFileException(filePath, e.message)
        }
    }

    @Throws(InvalidTokenException::class, InvalidSymbolException::class)
    fun analyze(buffer: BufferedReader): List<Token> {
        tokensAux.clear()
        expression.reset()
        currentLine = 1
        currentColumn = 0

        var cI: Int
        var c: Char
        while ((buffer.read().also { cI = it }) != -1) {
            currentColumn++
            c = cI.toChar()

            if(!expression.isReading()){
                expression.startReading(currentLine, currentColumn)
            }

            if(SymbolTable.isBreakLine(c)){
                identifyToken(false)
                currentLine++
                currentColumn = 0
            }else if(SymbolTable.isBreakCommand(c)){
                identifyToken(true)
                expression.append(c)
                identifyToken(false)
            }else if(SymbolTable.isWhitespaceOrTab(c)){
                if (expression.readingType() == ReadingType.STRING) {
                    expression.append(c)
                } else {
                    identifyToken(false)
                }
            }else if(SymbolTable.isStringIdentifier(c)){
                if(expression.readingType() == ReadingType.STRING){
                    if(SymbolTable.isBackslash(expression.lastCharacter())){
                        expression.append(c)
                        identifyToken(false)
                    }else{
                        expression.append(c)
                    }
                }else{
                    identifyToken(true)
                    expression.append(c)
                    expression.setReadingType(ReadingType.STRING)
                }
            }else if(SymbolTable.isBrackets(c)
                    || SymbolTable.isComma(c)){
                if(expression.readingType() == ReadingType.STRING){
                    expression.append(c)
                }else{
                    identifyToken(true)
                    expression.append(c)
                    identifyToken(false)
                }
            }else if(SymbolTable.isDot(c)) {
                if (expression.readingType() == ReadingType.STRING
                    || expression.readingType() == ReadingType.DIGIT) {
                    expression.append(c)
                }
            }else if(SymbolTable.isColon(c)) {
                expression.append(c)
                if (expression.readingType() != ReadingType.STRING) {
                    identifyToken(false)
                }
            }else if(SymbolTable.isHashtag(c)) {
                if (expression.readingType() != ReadingType.STRING) {
                    identifyToken(true)
                }
                expression.append(c)
            }else if(SymbolTable.isOperator(c)){
                if(expression.readingType() == ReadingType.STRING
                    || expression.readingType() == ReadingType.OPERATOR){
                    expression.append(c)
                }else{
                    identifyToken(true)
                    expression.append(c)
                    expression.setReadingType(ReadingType.OPERATOR)
                }
            }else if(SymbolTable.isDigit(c)){
                if(expression.readingType() == ReadingType.OPERATOR){
                    if(expression.size() == 1 && SymbolTable.canStartADigit(expression.lastCharacter())){
                        expression.setReadingType(ReadingType.DIGIT)
                    }else{
                        identifyToken(true)
                    }
                }else {
                    if (!expression.alreadyReadSomething()) {
                        expression.setReadingType(ReadingType.DIGIT)
                    }
                }
                expression.append(c)
            }else if(SymbolTable.isLetter(c)
                || SymbolTable.isUnderscore(c)
                || SymbolTable.isCash(c)){
                if(expression.readingType() == ReadingType.OPERATOR){
                    identifyToken(true)
                }
                expression.append(c)
            }else if(SymbolTable.isBackslash(c)){
                if(expression.readingType() == ReadingType.OPERATOR){
                    identifyToken(true)
                }
                expression.append(c)
            }else if(SymbolTable.isSpecial(c)){
                if(expression.readingType() == ReadingType.STRING){
                    expression.append(c)
                }else{
                    identifyToken(false)
                }
            }else{
                throw InvalidSymbolException(c, currentLine, currentColumn)
            }
        }

        if(expression.alreadyReadSomething()){
            if(expression.readingType() == ReadingType.STRING){
                throw TextNotClosedException(expression.build(), expression.startLine(), expression.startColumn())
            }
            identifyToken(false)
        }

        return ArrayList(tokensAux)
    }

    @Throws(InvalidTokenException::class)
    private fun identifyToken(startNewExpression: Boolean){
        if(expression.alreadyReadSomething()) {
            val ex = expression.build()
            println("Expressão '${ex}'")
            tokensAux.add(
                TokenIdentifier.identify(ex, expression.startLine(), expression.startColumn())
            )
        }
        expression.reset()
        if(startNewExpression){
            expression.startReading(currentLine, currentColumn)
        }
    }
}
