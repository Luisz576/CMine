package com.cmine.syntaix

abstract class SyntaxException(val syntaxExceptionName: String, val msg: String, val line: Int, val column: Int) : Exception()