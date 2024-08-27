package com.cmine.lib

import com.cmine.symbol_table.SymbolTable
import com.cmine.token.DigitToken
import com.cmine.token.Token
import com.cmine.token.exception.BadlyFormattedNumberException
import com.cmine.token.exception.InvalidTokenException
import com.cmine.token.exception.LexiconException
import com.cmine.token.token_identifier.TokenIdentifier
import com.cmine.token.tokens.T_ID_VAR
import lib.lang.TesteLangLexer
import lib.lang.TesteLangParser
import lib.lang.TesteLangParser.ProgramContext
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree

class CMineLib {
    @Throws(LexiconException::class)
    fun analyze(content: String): String {
        val inStremTokens = CharStreams.fromString(content)

        val lexerTokens = TesteLangLexer(inStremTokens)

        val elis = CMineLangErrorListener()
        lexerTokens.addErrorListener(elis)
        val tokens = ArrayList<Token>()

        var token = lexerTokens.nextToken()
        while (token.type != TesteLangParser.EOF && !elis.hasSomeError()) {
            tokens.add(identify(token.text, token.line, token.charPositionInLine+1))
            token = lexerTokens.nextToken()
        }
        if(elis.hasSomeError()){
            throw elis.error()!!
        }

        val inStream = CharStreams.fromString(content)
        val lexer = TesteLangLexer(inStream)

        val errorListener = object : BaseErrorListener() {
            val errors = mutableListOf<String>()

            override fun syntaxError(
                recognizer: Recognizer<*, *>,
                offendingSymbol: Any?,
                line: Int,
                charPositionInLine: Int,
                msg: String,
                e: RecognitionException?
            ) {
                errors.add("line $line:$charPositionInLine $msg")
            }
        }

        lexer.removeErrorListeners()
        lexer.addErrorListener(errorListener)

        val tokensStream = CommonTokenStream(lexer)
        val parser = TesteLangParser(tokensStream)
        parser.removeErrorListeners()
        parser.addErrorListener(errorListener)

        parser.program()

        // just to print
        val tokensString = StringBuilder()
        tokens.forEach { tokensString.append(it.tokenName() + " - " + it.expression() + "\n"); }

        return if (errorListener.errors.isNotEmpty()) {
            errorListener.errors.joinToString("\n")
        } else {
            "${tokensString}\nCompilado com sucesso!"
        }
    }

    @Throws(LexiconException::class)
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