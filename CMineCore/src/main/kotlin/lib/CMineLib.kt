package com.cmine.lib

import com.cmine.symbol_table.SymbolTable
import com.cmine.syntaix.SyntaxException
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
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class CMineLib {
    @Throws(LexiconException::class, SyntaxException::class)
    fun analyze(content: String): ProgramContext{
        val inStrem = CharStreams.fromString(content)

        val lexer = TesteLangLexer(inStrem)
        val errorListener = CMineLangErrorListener()
        lexer.removeErrorListeners()
        lexer.addErrorListener(errorListener)

        val tokens = ArrayList<Token>()

        var token = lexer.nextToken()
        while (token.type != TesteLangParser.EOF && !errorListener.hasSomeError()) {
            tokens.add(identify(token.text, token.line, token.charPositionInLine+1))
            token = lexer.nextToken()
        }
        if(errorListener.hasSomeError()){
            throw errorListener.error()!!
        }

        val inStrem2 = CharStreams.fromString(content)
        val lexer2 = TesteLangLexer(inStrem2)

        val tokensStream = CommonTokenStream(lexer2)
        val parser = TesteLangParser(tokensStream)
        val programTree = parser.program()

        return programTree
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