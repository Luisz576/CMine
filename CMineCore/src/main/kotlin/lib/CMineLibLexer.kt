package com.cmine.lib

import com.cmine.lang.listener.CMineLangErrorListener
import com.cmine.lexicon.expression.ReadingType
import com.cmine.symbol_table.SymbolTable
import com.cmine.token.DigitToken
import com.cmine.token.Token
import com.cmine.token.exception.BadlyFormattedNumberException
import com.cmine.token.exception.InvalidTokenException
import com.cmine.token.token_identifier.TokenIdentifier
import com.cmine.token.tokens.T_ID_VAR
import lib.lang.CMineLang
import org.antlr.v4.runtime.CharStreams
import java.io.BufferedReader
import java.io.FileReader

class CMineLibLexer {
    fun analyzeFromFile(filename: String): List<Token>{
        val bf = BufferedReader(FileReader(filename))
        val content = StringBuilder()
        var line: String
        try{
            while((bf.readLine().also { line = it }) != null) {
                content.append(line)
                content.append('\n')
            }
        }catch (e: Exception){
            e.printStackTrace()
        }
        bf.close()
        return analyze(content.toString())
    }

    fun analyze(buffer: BufferedReader): List<Token>{
        var cI: Int
        val builder = StringBuilder()
        while ((buffer.read().also { cI = it }) != -1) {
            builder.append(cI.toChar())
        }
        return analyze(builder.toString())
    }
    fun analyze(content: String): List<Token>{
        val inStrem = CharStreams.fromString(content)

        val lexer = CMineLang(inStrem)
        val errorListener = CMineLangErrorListener()
        lexer.removeErrorListeners()
        lexer.addErrorListener(errorListener)

        val tokens = ArrayList<Token>()

        var token = lexer.nextToken()
        while (token.type !== CMineLang.EOF && !errorListener.hasSomeError()) {
            println(token.text + " (" + CMineLang.tokenNames[token.type] + ")")
            tokens.add(identify(token.text, token.line, token.startIndex))
            token = lexer.nextToken()
        }
        if(errorListener.hasSomeError()){
            throw errorListener.error()!!
        }

        return tokens
    }

    fun identify(ex: String, startLine: Int, startColumn: Int): Token{
        try{
            val token = TokenIdentifier.identify(ex, startLine, startColumn)
            val tokenEx = token.expression()
            // println("> '${tokenEx}' (${token.tokenName()})")
            if(token is DigitToken){
                token.digitValidation()
            }else if(token is T_ID_VAR){
                token.validateName(startLine, startColumn)
            }
            return token
        }catch(e: InvalidTokenException){
            if(SymbolTable.isDigit(ex.first())){
                throw BadlyFormattedNumberException(ex, startLine, startColumn)
            }
            throw e
        }
    }
}