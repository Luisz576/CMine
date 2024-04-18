package com.cmine.token.tokens

import com.cmine.token.Token

class T_ID_VAR(expression: String, line: Int, column: Int)
    : Token("T_ID_VAR", expression, line, column){
    companion object{
        private val regex = Regex("[A-z\\_]([A-z0-9\\_]+)*")
        fun validate(expression: String): Boolean{
            return regex.matches(expression)
        }
    }
}
