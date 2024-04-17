package token.exception

class TextNotClosedException(val expression: String, val line: Int, val column: Int) : Exception()