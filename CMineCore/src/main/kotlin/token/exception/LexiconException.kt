package com.cmine.token.exception

abstract class LexiconException(val lexiconExceptionName: String, val expression: String, val line: Int, val column: Int) : Exception()