package com.cmine.token.exception

class BadlyFormattedVariableNameException(expression: String, line: Int, column: Int) : LexiconException("BadlyFormattedVariableName", expression, line, column)