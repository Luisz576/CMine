package com.cmine.token.tokens

import com.cmine.token.Token

class T_VAL_DOUBLE(expression: String, line: Int, column: Int)
    : Token("T_VAL_DOUBLE", expression, line, column){
    companion object{
        private val regex = Regex("\\b(\\d+)\\.(\\d+)\\b")
        fun validate(expression: String): Boolean{
            if(expression[0] == '-'){
                return regex.matches(expression.substring(1, expression.length))
            }
            return regex.matches(expression)
        }
    }
}
