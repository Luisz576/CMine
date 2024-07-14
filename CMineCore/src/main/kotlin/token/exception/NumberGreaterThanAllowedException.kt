package com.cmine.token.exception

class NumberGreaterThanAllowedException(expression: String, line: Int, column: Int) : LexiconException(expression, line, column)