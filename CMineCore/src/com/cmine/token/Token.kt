package com.cmine.token

abstract class Token(private val tokenName: String, private val expression: String, private val line: Int, private val column: Int) {
    fun tokenName(): String{
        return this.tokenName;
    }

    fun expression(): String {
        return this.expression
    }

    fun line(): Int {
        return this.line
    }

    fun column(): Int {
        return this.column
    }
}