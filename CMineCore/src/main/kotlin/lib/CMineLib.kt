package com.cmine.lib

import com.cmine.token.Token
import com.cmine.token.exception.LexiconException
import lib.lang.TesteLangLexer
import lib.lang.TesteLangParser
import lib.lang.TesteLangParser.ProgramContext
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class CMineLib {
    @Throws(LexiconException::class)
    fun analyze(content: String): ProgramContext{
        val inStrem = CharStreams.fromString(content)

        val lexer = TesteLangLexer(inStrem)
//        val errorListener = CMineLangErrorListener()
        lexer.removeErrorListeners()
//        lexer.addErrorListener(errorListener)

        val tokens = ArrayList<Token>()

        //var token = lexer.nextToken()
        //while (token.type != TesteLangParser.g4.EOF){ //&& !errorListener.hasSomeError()) {
        //    tokens.add(identify(token.text, token.line, token.charPositionInLine+1))
        //    token = lexer.nextToken()
        //}
//        if(errorListener.hasSomeError()){
//            throw errorListener.error()!!
//        }

        val tokensStream = CommonTokenStream(lexer)
        val parser = TesteLangParser(tokensStream)
        val programTree = parser.program()
        println("A")
        println(programTree.children)
        println("B")

        return programTree
    }
}