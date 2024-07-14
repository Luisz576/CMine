package com.cmine.token.exception

abstract class LexiconException(val expression: String, val line: Int, val column: Int) : Exception()