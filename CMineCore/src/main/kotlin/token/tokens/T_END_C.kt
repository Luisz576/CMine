package com.cmine.token.tokens

import com.cmine.token.Token

class T_END_C(expression: String, line: Int, column: Int)
    : Token("T_END_C", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression == ";"
        }
    }
}
