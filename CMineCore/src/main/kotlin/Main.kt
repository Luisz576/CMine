package com.cmine

import com.cmine.lexicon.LexiconAnalyzer
import com.cmine.token.exception.InvalidTokenException

object CMine {
    @JvmStatic
    fun main(args: Array<String>) {
        println("CMine")
        try{
            val tokens = LexiconAnalyzer().analyzeFromFile("teste.txt")
            println(tokens.size)
        }catch(e: Exception){
            println("Error: $e (${e.javaClass})")
            if(e is InvalidTokenException){
                println("Error: '${e.expression}'")
            }
        }
    }
}
