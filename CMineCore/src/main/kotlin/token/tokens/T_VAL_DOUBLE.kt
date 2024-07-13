package com.cmine.token.tokens

import com.cmine.token.DigitToken
import com.cmine.token.exception.NumberGreaterThanAllowedException

class T_VAL_DOUBLE(expression: String, line: Int, column: Int)
    : DigitToken("T_VAL_DOUBLE", expression, line, column){
    companion object{
        private val regex = Regex("\\b(\\d+)\\.(\\d+)\\b")
        fun validate(expression: String): Boolean{
            if(expression[0] == '-'){
                return regex.matches(expression.substring(1, expression.length))
            }
            return regex.matches(expression)
        }
    }

    override fun digitValidation() {
        try{
            if(expression().contains('.')){
                val parts = expression().split('.')
                if(parts.size > 1){
                    parts[0].toInt()
                    parts[1].toInt()
                    return
                }
                parts[0].toInt()
            }
            expression().toInt()
        }catch (e: Exception){
            throw NumberGreaterThanAllowedException(expression(), line(), column())
        }
    }
}
