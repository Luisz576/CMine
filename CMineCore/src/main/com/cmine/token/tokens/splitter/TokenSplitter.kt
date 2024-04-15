package com.cmine.token.tokens.splitter

class TokenSplitter {
    companion object {
        private val splitters = ArrayList<Char>()
        init {
            splitters.add('(')
            splitters.add(')')
            splitters.add('{')
            splitters.add('}')
            splitters.add('.')
            splitters.add('-')
            splitters.add('!')
            splitters.add('+')
            splitters.add('/')
            splitters.add(',')
            splitters.add('^')
            splitters.add('*')
            // TODO: melhorar lógica?
        }
        fun isTokenSplitter(c: Char): Boolean{
            return isJustTokenSplitter(c) || splitters.contains(c)
        }
        fun isJustTokenSplitter(c: Char): Boolean{
            return c == ' '
        }
    }
}