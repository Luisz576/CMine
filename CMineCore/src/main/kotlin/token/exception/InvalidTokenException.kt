package com.cmine.token.exception

class InvalidTokenException(expression: String, line: Int, column: Int) : LexiconException(expression, line, column)