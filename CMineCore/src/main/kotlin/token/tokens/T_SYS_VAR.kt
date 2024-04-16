package com.cmine.token.tokens

import com.cmine.token.Token

class T_SYS_VAR(expression: String, line: Int, column: Int)
    : Token("T_SYS_VAR", expression, line, column){
    companion object{
        enum class SYS_VAR(val v: String){
            DELTA("delta"),
            PATH("path"),
            VERSION("version"),
            APP_NAME("app_name")
        }

        fun validate(expression: String): Boolean{
            val ex = expression.lowercase()
            for(sysVar in SYS_VAR.entries){
                if(sysVar.v == ex){
                    return true
                }
            }
            return false
        }
    }
}
