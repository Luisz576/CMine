package com.cmine.token.tokens

import com.cmine.token.Token

class T_VAL_INT(expression: String, line: Int, column: Int)
    : Token("T_VAL_INT", expression, line, column){
    companion object{
        private val regex = Regex("\\b\\d+\\b")
        fun validate(expression: String): Boolean{
            if(expression[0] == '-'){
                return regex.matches(expression.substring(1, expression.length))
            }
            return regex.matches(expression)
        }
    }
}
