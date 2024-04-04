package com.cmine.token.tokens

import com.cmine.token.Token

class T_REP_WHILE(expression: String, line: Int, column: Int)
    : Token("T_REP_WHILE", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression.lowercase() == "journey"
        }
    }
}
