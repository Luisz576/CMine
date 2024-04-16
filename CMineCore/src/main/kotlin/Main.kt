package com.cmine

import com.cmine.lexicon.LexiconAnalyzer

object CMine {
    @JvmStatic
    fun main(args: Array<String>) {
        println("CMine")
        val tokens = LexiconAnalyzer().analyzeFromFile("teste.txt")
        println(tokens.size)
    }
}
