package com.cmine.token.exception

class NumberGreaterThanAllowedException(val expression: String, val line: Int, val column: Int) : Exception()