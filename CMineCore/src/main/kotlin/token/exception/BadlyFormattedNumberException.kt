package com.cmine.token.exception

class BadlyFormattedNumberException(expression: String, line: Int, column: Int) : LexiconException(expression, line, column)