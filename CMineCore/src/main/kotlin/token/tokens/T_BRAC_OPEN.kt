package com.cmine.token.tokens

import com.cmine.token.Token

class T_BRAC_OPEN(expression: String, line: Int, column: Int)
    : Token("T_BRAC_OPEN", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression == "{"
        }
    }
}
