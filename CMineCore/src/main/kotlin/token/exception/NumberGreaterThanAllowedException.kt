package com.cmine.token.exception

class NumberGreaterThanAllowedException(expression: String, line: Int, column: Int) : LexiconException("NumberGreaterThanAllowed", expression, line, column)