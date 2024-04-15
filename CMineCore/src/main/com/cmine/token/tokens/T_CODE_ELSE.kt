package com.cmine.token.tokens

import com.cmine.token.Token

class T_CODE_ELSE(expression: String, line: Int, column: Int)
    : Token("T_CODE_ELSE", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression.lowercase() == "checked"
        }
    }
}
