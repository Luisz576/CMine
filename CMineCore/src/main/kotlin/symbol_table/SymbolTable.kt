package com.cmine.symbol_table

class SymbolTable {
    companion object{
        fun isBreakLine(c: Char): Boolean{
            return c == '\n' || c == '\r'
        }

        fun isWhitespaceOrTab(c: Char): Boolean{
            return c == ' ' || c == '\t'
        }

        fun isOperator(c: Char): Boolean{
            return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '='
        }

        fun isColon(c: Char): Boolean{
            return c == ':'
        }

        fun isLetter(c: Char): Boolean{
            return c in 'a'..'z'
        }

        fun isDigit(c: Char): Boolean{
            return c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0'
        }

        fun isBrackets(c: Char): Boolean{
            return c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}'
        }

        fun isStringIdentifier(c: Char): Boolean{
            return c == '"'
        }
    }
}