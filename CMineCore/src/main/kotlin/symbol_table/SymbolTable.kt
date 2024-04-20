package com.cmine.symbol_table

class SymbolTable {
    companion object{
        fun isBreakLine(c: Char): Boolean{
            return c == '\n'
        }

        fun isBreakCommand(c: Char): Boolean{
            return c == ';'
        }

        fun isWhitespaceOrTab(c: Char): Boolean{
            return c == ' ' || c == '\t' || c == '\r'
        }

        fun isUnderscore(c: Char): Boolean{
            return c == '_'
        }

        fun isCash(c: Char): Boolean{
            return c == '$'
        }

        fun canStartADigit(c: Char): Boolean{
            return c == '-'
        }

        fun isSpecial(c: Char): Boolean{
            return c == '?' || c == '@' || c == '¨' || c in '~'..'»'
                    || c in 'Á'..'©' || c in '¢'..'¥' || c in 'ã'..'Ã'
                    || c in '¤'..'Ï' || c in 'Ó'..'´' || c == '±' ||
                    c in '¾'..'÷' || c in '°'..'²'
        }
        fun isHashtag(c: Char): Boolean{
            return c == '#'
        }

        fun isDot(c: Char): Boolean{
            return c == '.'
        }

        fun isComma(c: Char): Boolean{
            return c == ','
        }

        fun isOperator(c: Char): Boolean{
            return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '=' || c == '!' || c == '|' || c == '&' || c == '<' || c == '>' || c == '%'
        }

        fun isColon(c: Char): Boolean{
            return c == ':'
        }

        fun isLetter(c: Char): Boolean{
            return c in 'a'..'z' || c in 'A'..'Z'
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

        fun isBackslash(c: Char): Boolean{
            return c == '\\'
        }
    }
}