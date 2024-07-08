package com.cmine.token.exception

class BadlyFormattedVariableNameException(val expression: String, val line: Int, val column: Int) : Exception()