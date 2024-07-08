package com.cmine.token.exception

class BadlyFormattedStringException(val expression: String, val line: Int, val column: Int) : Exception()