package com.cmine.token.exception

class BadlyFormattedStringException(expression: String, line: Int, column: Int) : LexiconException(expression, line, column)