package com.cmine.lexicon.exception

class InvalidTokenException(val expression: String, val line: Int, val column: Int) : LexiconException