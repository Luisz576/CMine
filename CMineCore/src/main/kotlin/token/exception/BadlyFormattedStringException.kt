package com.cmine.token.exception

class BadlyFormattedStringException(expression: String, line: Int, column: Int) : LexiconException("BadlyFormattedString", expression, line, column)