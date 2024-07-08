package com.cmine.token.tokens

import com.cmine.token.DigitToken
import com.cmine.token.exception.NumberGreaterThanAllowedException

class T_VAL_INT(expression: String, line: Int, column: Int)
    : DigitToken("T_VAL_INT", expression, line, column){
    companion object{
        private val regex = Regex("\\b\\d+\\b")
        fun validate(expression: String): Boolean{
            if(expression[0] == '-'){
                return regex.matches(expression.substring(1, expression.length))
            }
            return regex.matches(expression)
        }
    }

    override fun digitValidation() {
        try{
            expression().toInt()
        }catch (e: Exception){
            throw NumberGreaterThanAllowedException(expression(), line(), column())
        }
    }
}
