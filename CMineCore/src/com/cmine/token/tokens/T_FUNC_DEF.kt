package com.cmine.token.tokens

import com.cmine.token.Token

class T_FUNC_DEF(expression: String, line: Int, column: Int)
    : Token("T_FUNC_DEF", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression.lowercase() == "quest"
        }
    }
}
