package com.cmine.token.tokens

import com.cmine.token.Token

class T_OP_NOT(expression: String, line: Int, column: Int)
    : Token("T_OP_NOT", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression == "!"
        }
    }
}
