package com.cmine.token.finder

import com.cmine.token.Token
import com.cmine.token.tokens.*

class TokenIdentifier {
    companion object{
        fun tokenFromExpression(expression: String, line: Int, column: Int): Token?{
            if(T_CODE_S.validate(expression)) {
                return T_CODE_S(expression, line, column);
            }else if(T_CODE_E.validate(expression)){
                return T_CODE_E(expression, line, column);
            }
            return null;
        }
    }
}