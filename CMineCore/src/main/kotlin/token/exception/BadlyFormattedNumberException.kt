package com.cmine.token.exception

class BadlyFormattedNumberException(val expression: String, val line: Int, val column: Int) : Exception()