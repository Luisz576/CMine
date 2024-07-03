package com.cmine

import com.cmine.lexicon.LexiconAnalyzer

object CMine {
    @JvmStatic
    fun main(args: Array<String>) {
        println("CMine")
        val tokens = LexiconAnalyzer().analyzeFromFile("C:\\Users\\Gabriel\\Desktop\\CMine\\teste.txt")
        println(tokens.size)
    }
}
