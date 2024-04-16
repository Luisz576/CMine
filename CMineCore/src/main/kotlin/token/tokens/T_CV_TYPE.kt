package com.cmine.token.tokens

import com.cmine.token.Token

class T_CV_TYPE(expression: String, line: Int, column: Int)
    : Token("T_CV_TYPE", expression, line, column){
    companion object{
        enum class VarType(val type: String){
            COIN("coin"),
            MONEY("money"),
            TEXT("text"),
            COMPLETED("completed"),
            LIST("list")
        }

        fun validate(expression: String): Boolean{
            val ex = expression.lowercase()
            for(vt in VarType.entries){
                if(vt.type == ex){
                    return true
                }
            }
            return false
        }
    }
}