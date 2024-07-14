package com.cmine.token.exception

class VariableNameExceedsAllowedLimitException(expression: String, line: Int, column: Int) : LexiconException("VariableNameExceedsAllowedLimit", expression, line, column)