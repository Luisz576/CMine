package com.cmine.token.tokens

import com.cmine.symbol_table.SymbolTable
import com.cmine.token.Token
import com.cmine.token.exception.BadlyFormattedVariableNameException
import com.cmine.token.exception.VariableNameExceedsAllowedLimitException
import kotlin.jvm.Throws

class T_ID_VAR(expression: String, line: Int, column: Int)
    : Token("T_ID_VAR", expression, line, column){
    companion object{
        private val regex = Regex("[A-z\\_]([A-z0-9\\_]+)*")
        fun validate(expression: String): Boolean{
            return regex.matches(expression)
        }

        const val MAX_VAR_NAME_SIZE = 100
    }

    @Throws(VariableNameExceedsAllowedLimitException::class, BadlyFormattedVariableNameException::class)
    fun validateName(line: Int, column: Int){
        val ex = expression()
        if(ex.length > MAX_VAR_NAME_SIZE){
            throw VariableNameExceedsAllowedLimitException(ex, line, column)
        }else{
            ex.forEach {
                if(
                    SymbolTable.isCommentOperator(it)
                    || SymbolTable.isCash(it)
                    || SymbolTable.isSpecial(it)
                    || SymbolTable.isHashtag(it)
                    || SymbolTable.isDot(it)
                    || SymbolTable.isComma(it)
                    || SymbolTable.isOperator(it)
                    || SymbolTable.isColon(it)
                    || SymbolTable.isBrackets(it)
                    || SymbolTable.isStringIdentifier(it)
                    || SymbolTable.isBackslash(it)
                ){
                    throw BadlyFormattedVariableNameException(ex, line, column)
                }
            }
        }
    }
}
