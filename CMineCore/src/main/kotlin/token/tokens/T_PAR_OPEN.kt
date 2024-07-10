package com.cmine.token.tokens

import com.cmine.token.Token

class T_PAR_OPEN(expression: String, line: Int, column: Int)
    : Token("T_PAR_OPEN", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression == "("
        }
    }
}