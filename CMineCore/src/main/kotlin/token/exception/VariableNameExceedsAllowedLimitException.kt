package com.cmine.token.exception

class VariableNameExceedsAllowedLimitException(val expression: String, val line: Int, val column: Int) : Exception()