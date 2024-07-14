package token.exception

import com.cmine.token.exception.LexiconException

class UnexpectedEndOfFileException(expression: String, line: Int, column: Int) : LexiconException("UnexpectedEndOfFile", expression, line, column)