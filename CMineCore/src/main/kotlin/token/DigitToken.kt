package com.cmine.token

import com.cmine.token.exception.NumberGreaterThanAllowedException
import kotlin.jvm.Throws

abstract class DigitToken(tokenName: String, expression: String, line: Int, column: Int) : Token(tokenName, expression, line, column){
    @Throws(NumberGreaterThanAllowedException::class)
    abstract fun digitValidation()
}