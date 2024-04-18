package com.cmine.token.tokens

import com.cmine.token.Token

class T_COMMA(expression: String, line: Int, column: Int)
    : Token("T_COMMA", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression == ","
        }
    }
}
