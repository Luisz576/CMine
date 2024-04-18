package com.cmine.token.token_identifier

import com.cmine.token.Token
import com.cmine.token.exception.InvalidTokenException
import com.cmine.token.tokens.*

class TokenIdentifier {
    companion object{
        @Throws(InvalidTokenException::class)
        fun identify(expression: String, line: Int, column: Int): Token{
            if(T_CODE_E.validate(expression)) return T_CODE_E(expression, line, column)
            else if(T_CODE_S.validate(expression)) return T_CODE_S(expression, line, column)

            else if(T_END_C.validate(expression)) return T_END_C(expression, line, column)

            else if(T_COMMA.validate(expression)) return T_COMMA(expression, line, column)

            else if(T_CODE_IF.validate(expression)) return T_CODE_IF(expression, line, column)
            else if(T_CODE_ELSE.validate(expression)) return T_CODE_ELSE(expression, line, column)

            else if(T_EX_TRY.validate(expression)) return T_EX_TRY(expression, line, column)
            else if(T_EX_CATCH.validate(expression)) return T_EX_CATCH(expression, line, column)

            else if(T_FUNC_DEF.validate(expression)) return T_FUNC_DEF(expression, line, column)
            else if(T_FUNC_RET.validate(expression)) return T_FUNC_RET(expression, line, column)

            else if(T_OP_REL.validate(expression)) return T_OP_REL(expression, line, column)
            else if(T_OP_ATR.validate(expression)) return T_OP_ATR(expression, line, column)
            else if(T_OP_LOG.validate(expression)) return T_OP_LOG(expression, line, column)
            else if(T_OP_MATH.validate(expression)) return T_OP_MATH(expression, line, column)

            else if(T_SYS_VAR.validate(expression)) return T_SYS_VAR(expression, line, column)
            else if(T_SYS_FUNC.validate(expression)) return T_SYS_FUNC(expression, line, column)

            else if(T_PAR_OPEN.validate(expression)) return T_PAR_OPEN(expression, line, column)
            else if(T_PAR_CLOSE.validate(expression)) return T_PAR_CLOSE(expression, line, column)
            else if(T_BRAC_OPEN.validate(expression)) return T_BRAC_OPEN(expression, line, column)
            else if(T_BRAC_CLOSE.validate(expression)) return T_BRAC_CLOSE(expression, line, column)

            else if(T_REP_BREAK.validate(expression)) return T_REP_BREAK(expression, line, column)
            else if(T_REP_CONT.validate(expression)) return T_REP_CONT(expression, line, column)
            else if(T_REP_FOR.validate(expression)) return T_REP_FOR(expression, line, column)
            else if(T_REP_WHILE.validate(expression)) return T_REP_WHILE(expression, line, column)

            else if(T_CV_TYPE.validate(expression)) return T_CV_TYPE(expression, line, column)

            else if(T_VAL_BOOL.validate(expression)) return T_VAL_BOOL(expression, line, column)
            else if(T_VAL_INT.validate(expression)) return T_VAL_INT(expression, line, column)
            else if(T_VAL_DOUBLE.validate(expression)) return T_VAL_DOUBLE(expression, line, column)

            else if(T_ID_CONST.validate(expression)) return T_ID_CONST(expression, line, column)
            else if(T_ID_VAR.validate(expression)) return T_ID_VAR(expression, line, column)
            else if(T_ID_FUNC.validate(expression)) return T_ID_FUNC(expression, line, column)

            throw InvalidTokenException(expression, line, column)
        }
    }
}