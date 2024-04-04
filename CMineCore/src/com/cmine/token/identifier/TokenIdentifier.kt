package com.cmine.token.identifier

import com.cmine.token.Token
import com.cmine.token.tokens.*

class TokenIdentifier {
    companion object{
        fun tokenFromExpression(expression: String, line: Int, column: Int): Token?{

            if(T_CODE_S.validate(expression)) { // T_CODE_S
                return T_CODE_S(expression, line, column)
            }else if(T_CODE_E.validate(expression)){ // T_CODE_E
                return T_CODE_E(expression, line, column)

            }else if(T_OP_MATH.validate(expression)){ // T_OP_MATH
                return T_OP_MATH(expression, line, column)
            }else if(T_OP_ATR.validate(expression)){ // T_OP_ATR
                return T_OP_ATR(expression, line, column)
            }else if(T_OP_LOG.validate(expression)){ // T_OP_LOG
                return T_OP_LOG(expression, line, column)

            }else if(T_CV_TYPE.validate(expression)){ // T_CV_TYPE
                return T_CV_TYPE(expression, line, column)
            }
            // TODO:

            return null
        }
    }
}