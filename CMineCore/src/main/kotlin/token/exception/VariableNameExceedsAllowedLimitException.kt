package com.cmine.token.exception

class VariableNameExceedsAllowedLimitException(expression: String, line: Int, column: Int) : LexiconException(expression, line, column)