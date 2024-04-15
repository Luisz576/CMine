package com.cmine.lexicon

import com.cmine.lexicon.exception.InvalidFileException
import com.cmine.lexicon.exception.LexiconException
import com.cmine.token.Token
import com.cmine.token.identifier.TokenIdentifier
import com.cmine.token.tokens.splitter.TokenSplitter
import com.cmine.util.Tuple
import java.io.BufferedReader
import java.io.File
import java.io.IOException
import java.util.ArrayList

class LexiconAnalyzer{
    private val tokensAux = ArrayList<Token>()

    fun analyze(buffer: BufferedReader): Tuple<LexiconException?, List<Token>> {
        tokensAux.clear()

        var currentLine = 1
        var c = buffer.
        while () {

        }

        return Tuple(null, ArrayList(tokensAux))
    }

    @Throws(InvalidFileException::class)
    fun analyzeFromFile(filePath: String) : Tuple<LexiconException?, List<Token>> {
        val file = File(filePath)
        if(!file.exists()){
            throw InvalidFileException(filePath, "File not exists")
        }
        try{
            val buffer = BufferedReader(file.reader())
            val r = analyze(buffer)
            buffer.close()
            return r
        }catch (e: IOException){
            throw InvalidFileException(filePath, e.message)
        }
    }
}
