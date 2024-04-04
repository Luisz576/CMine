package com.cmine.token.tokens

import com.cmine.token.Token

class T_VAL_BOOL(expression: String, line: Int, column: Int)
    : Token("T_VAL_BOOL", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            val ex = expression.lowercase()
            return ex == "true" || ex == "false"
        }
    }
}
