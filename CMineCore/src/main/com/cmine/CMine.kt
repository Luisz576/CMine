package com.cmine

import com.cmine.lexicon.LexiconAnalyzer

object CMine {
    @JvmStatic
    fun main(args: Array<String>) {
        println("CMine")
        LexiconAnalyzer().analyzeFromFile("teste.txt")
    }
}
