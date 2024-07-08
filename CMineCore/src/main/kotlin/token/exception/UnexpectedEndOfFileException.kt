package token.exception

class UnexpectedEndOfFileException(val expression: String, val line: Int, val column: Int) : Exception()