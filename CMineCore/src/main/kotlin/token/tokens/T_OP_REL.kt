package com.cmine.token.tokens

import com.cmine.token.Token

class T_OP_REL(expression: String, line: Int, column: Int)
    : Token("T_OP_REL", expression, line, column){
    companion object{
        enum class OP(val op: String){
            GREATER(">"),
            GREATER_EQUAL(">="),
            LESS("<"),
            LESS_EQUAL("<="),
            EQUAL("=="),
            DIFERENT("!="),
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
