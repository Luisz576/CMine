package com.cmine.token.tokens

import com.cmine.token.Token

class T_ID_FUNC(expression: String, line: Int, column: Int)
    : Token("T_ID_FUNC", expression, line, column){
    companion object{
        private val regex = Regex("\\$[a-zA-Z\\_]([a-zA-Z0-9\\_]+)*")
        fun validate(expression: String): Boolean{
            return regex.matches(expression)
        }
    }
}
