package com.cmine.token.tokens

import com.cmine.symbol_table.SymbolTable
import com.cmine.token.Token

class T_COMMENT(expression: String, line: Int, column: Int) :
    Token("T_COMMENT", expression, line, column){
    companion object{
        fun validate(expression: String): Boolean {
            return expression.length > 1 && SymbolTable.isCommentOperator(expression[0]) && SymbolTable.isCommentOperator(expression[1])
        }
    }
}