package com.cmine.lexicon

import com.cmine.lexicon.exception.InvalidFileException
import com.cmine.lexicon.expression.ExpressionBuilder
import com.cmine.symbol_table.SymbolTable
import com.cmine.symbol_table.exception.InvalidSymbolException
import com.cmine.token.Token
import com.cmine.token.exception.InvalidTokenException
import com.cmine.token.token_identifier.TokenIdentifier
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

            if(expression.startLineAndColumnAreNotSetted()){
                expression.setStartLineAndColumn(currentLine, currentColumn)
            }

            if(SymbolTable.isBreakLine(c)){
                identifyToken()
                currentLine++
                currentColumn = 0
            }else if(SymbolTable.isWhitespaceOrTab(c)){
                if(expression.isReadingString()){
                    expression.append(c)
                }else{
                    // TODO:
                    identifyToken()
                }
            }else if(SymbolTable.isBrackets(c)){
                // TODO:
            }else if(SymbolTable.isStringIdentifier(c)){
                // TODO:
            }else if(SymbolTable.isColon(c)){
                // TODO:
            }else if(SymbolTable.isOperator(c)){
                // TODO:
            }else if(SymbolTable.isDigit(c)){
                // TODO:
            }else if(SymbolTable.isLetter(c)){
                // TODO:
            }else{
                throw InvalidSymbolException(c, currentLine, currentColumn)
            }
        }

        if(expression.size() > 0){
            identifyToken()
        }

        return ArrayList(tokensAux)
    }

    @Throws(InvalidTokenException::class)
    private fun identifyToken(){
        val a = expression.build()
        println("A: '$a'") // TODO:
        tokensAux.add(
            TokenIdentifier.identify(a, expression.startLine(), expression.startColumn())
        )
        expression.reset()
    }
}
