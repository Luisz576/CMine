package com.cmine.lib

import com.cmine.symbol_table.SymbolTable
import com.cmine.token.exception.BadlyFormattedStringException
import com.cmine.token.exception.InvalidTokenException
import org.antlr.v4.runtime.ANTLRErrorListener
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import java.util.BitSet

class CMineLangErrorListener : ANTLRErrorListener {
    private var someError: Exception? = null

    fun hasSomeError(): Boolean {
        return someError != null
    }

    fun error(): Exception?{
        return someError
    }

    override fun syntaxError(
        p0: Recognizer<*, *>?,
        p1: Any?,
        p2: Int,
        p3: Int,
        p4: String?,
        p5: RecognitionException?
    ) {
        if(p4 != null){
            var a = 0
            var expression = ""
            var t = p4.length-1
            for (i in 0..<t){
                if(a == 0 && p4[i] == '\''){
                    a = 1
                }else if(a != 0){
                    expression += p4[i]
                    if(a == 1 && SymbolTable.isStringIdentifier(p4[i])){
                        someError = BadlyFormattedStringException(p4, p2, p3+1)
                        break
                    }
                    a = 2
                }
            }
            throw InvalidTokenException(expression, p2, p3+1)
        }
    }

    override fun reportAmbiguity(p0: Parser?, p1: DFA?, p2: Int, p3: Int, p4: Boolean, p5: BitSet?, p6: ATNConfigSet?) {
        // println("reportAmbiguity")
    }

    override fun reportAttemptingFullContext(p0: Parser?, p1: DFA?, p2: Int, p3: Int, p4: BitSet?, p5: ATNConfigSet?) {
        // println("reportAttemptingFullContext")
    }

    override fun reportContextSensitivity(p0: Parser?, p1: DFA?, p2: Int, p3: Int, p4: Int, p5: ATNConfigSet?) {
        // println("reportContextSensitivity")
    }
}