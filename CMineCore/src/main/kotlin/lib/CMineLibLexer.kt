package com.cmine.lib;

//import com.cmine.lib.lang.listener.CMineLangErrorListener
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
//import lib.lang_old.CMineLang
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.BufferedReader
import java.io.FileReader

class CMineLibLexer {
    @Throws(LexiconException::class)
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

    @Throws(LexiconException::class)
    fun analyze(buffer: BufferedReader): List<Token>{
        var cI: Int
        val builder = StringBuilder()
        while ((buffer.read().also { cI = it }) != -1) {
            builder.append(cI.toChar())
        }
        return analyze(builder.toString())
    }
    @Throws(LexiconException::class)
    fun analyze(content: String): List<Token>{
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

        return tokens
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