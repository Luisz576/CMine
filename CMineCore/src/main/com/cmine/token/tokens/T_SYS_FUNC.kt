package com.cmine.token.tokens

import com.cmine.token.Token

class T_SYS_FUNC(expression: String, line: Int, column: Int)
    : Token("T_SYS_FUNC", expression, line, column){
    companion object{
        enum class SYS_FUNC(val f){
            SHOW_SCREEN("show_screen"),
            KILL_APP("kill_app")
        }

        fun validate(expression: String): Boolean{
            val ex = expression.lowercase()
            for(sysFunc in SYS_FUNC){
                if(sysFunc.f == ex){
                    return true
                }
            }
            return false
        }
    }
}
