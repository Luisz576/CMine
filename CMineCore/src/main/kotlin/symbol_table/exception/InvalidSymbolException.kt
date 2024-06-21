package com.cmine.symbol_table.exception

class InvalidSymbolException(val symbol: Char, val line: Int, val column: Int) : Exception()