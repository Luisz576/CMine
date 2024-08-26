package com.cmine.lib

import com.cmine.token.Token
import com.cmine.token.exception.LexiconException
import lib.lang.TesteLangLexer
import lib.lang.TesteLangParser
import lib.lang.TesteLangParser.ProgramContext
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree

class CMineLib {
    @Throws(LexiconException::class)
    fun analyze(content: String): String {
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

        return if (errorListener.errors.isNotEmpty()) {
            errorListener.errors.joinToString("\n")
        } else {
            "Compilado com sucesso!"
        }
    }
}