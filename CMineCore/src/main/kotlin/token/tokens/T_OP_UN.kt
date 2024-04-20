package com.cmine.token.tokens

import com.cmine.token.Token

class T_OP_UN(expression: String, line: Int, column: Int)
    : Token("T_OP_UN", expression, line, column){
    companion object{
        enum class OP(val op: String){
            INCREMENT("++"),
            DECREMENT("--")
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
