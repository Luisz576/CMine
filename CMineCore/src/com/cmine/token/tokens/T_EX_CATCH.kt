package com.cmine.token.tokens

import com.cmine.token.Token

class T_EX_CATCH(expression: String, line: Int, column: Int)
    : Token("T_EX_CATCH", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean{
            return expression.lowercase() == "crash"
        }
    }
}
