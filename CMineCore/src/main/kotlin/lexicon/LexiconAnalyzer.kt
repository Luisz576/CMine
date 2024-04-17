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
            println("line $currentLine / column $currentColumn : $c")

            if(!expression.isReading()){
                expression.startReading(currentLine, currentColumn)
            }

            if(SymbolTable.isBreakLine(c)){
                identifyToken()
                currentLine++
                currentColumn = 0
            }else if(SymbolTable.isWhitespaceOrTab(c)){
                if(expression.alreadyReadSomething()) {
                    if (expression.readingType() == ReadingType.STRING) {
                        expression.append(c)
                    } else {
                        identifyToken()
                    }
                }
            }else if(SymbolTable.isStringIdentifier(c)){
                if(expression.readingType() == ReadingType.STRING){
                    if(SymbolTable.isBackslash(expression.lastCharacter())){
                        expression.append(c)
                        identifyToken()
                    }else{
                        expression.append(c)
                    }
                }else{
                    identifyToken()
                    expression.startReadingAppending(currentLine, currentColumn, c)
                    expression.setReadingType(ReadingType.STRING)
                }
            }else if(SymbolTable.isBrackets(c)){
                if(expression.readingType() == ReadingType.STRING){
                    expression.append(c)
                }else{
                    // TODO:
                }
            }else if(SymbolTable.isColon(c)){
                if(expression.readingType() == ReadingType.STRING){
                    expression.append(c)
                }else{
                    // TODO:
                }
            }else if(SymbolTable.isOperator(c)){
                if(expression.readingType() == ReadingType.STRING){
                    expression.append(c)
                }else{
                    // TODO:
                }
            }else if(SymbolTable.isDigit(c)){
                if(expression.readingType() == ReadingType.STRING){
                    expression.append(c)
                }else{
                    // TODO:
                }
            }else if(SymbolTable.isLetter(c)){
                expression.append(c)
            }else if(SymbolTable.isBackslash(c)){
                expression.append(c)
            }else{
                throw InvalidSymbolException(c, currentLine, currentColumn)
            }
        }

        if(expression.alreadyReadSomething()){
            if(expression.readingType() == ReadingType.STRING){
                throw TextNotClosedException(expression.build(), expression.startLine(), expression.startColumn())
            }
        }

        return ArrayList(tokensAux)
    }

    @Throws(InvalidTokenException::class)
    private fun identifyToken(){
        if(expression.alreadyReadSomething()) {
            val ex = expression.build()
            println("Expressão '${ex}'")
            tokensAux.add(
                TokenIdentifier.identify(ex, expression.startLine(), expression.startColumn())
            )
        }
        expression.reset()
    }
}
