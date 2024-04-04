package com.cmine.lexicon

import com.cmine.lexicon.exception.LexiconException
import com.cmine.token.Token
import com.cmine.util.Tuple
import java.util.ArrayList

class LexiconAnalyzer{
    fun analyze(fileContent: StringBuffer): Tuple<LexiconException?, List<Token>> {
        val tokens: List<Token> = ArrayList();
        // TODO: Lista ou arvore?
        return Tuple(null, tokens);
    }
}
