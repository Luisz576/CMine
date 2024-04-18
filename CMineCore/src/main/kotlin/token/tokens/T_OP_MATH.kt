package com.cmine.token.tokens

import com.cmine.token.Token

class T_OP_MATH(expression: String, line: Int, column: Int)
    : Token("T_OP_MATH", expression, line, column){
    companion object{
        enum class OP(val op: String) {
            SUM("+"),
            SUBTRACTION("-"),
            MULTIPLICATION("*"),
            DIVISION("/"),
            EXPONENT("^"),
            MOD("%")
        }

        fun validate(expression: String): Boolean{
            for(op in OP.entries){
                if(op.op == expression){
                    return true
                }
            }
            return false
        }
    }
}
