package com.cmine.symbol_table.exception

import com.cmine.token.exception.LexiconException

class InvalidSymbolException(symbol: Char, line: Int, column: Int) : LexiconException("InvalidSymbol", symbol.toString(), line, column)