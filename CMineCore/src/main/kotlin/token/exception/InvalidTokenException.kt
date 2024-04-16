package com.cmine.token.exception

class InvalidTokenException(val expression: String, val line: Int, val column: Int) : Exception()