package com.cmine.lexicon.expression

class ExpressionBuilder {
    private val expression = StringBuilder()
    fun size(): Int{
        return expression.length
    }

    private var isReadingString = false
    fun isReadingString(): Boolean{
        return isReadingString
    }
    fun setReadingString(isReadingString: Boolean){
        this.isReadingString = isReadingString
    }

    private var startColumn = -1
    private var startLine = -1
    fun startColumn(): Int{
        return startColumn
    }
    fun startLine(): Int{
        return startLine
    }
    fun startLineAndColumnAreNotSetted(): Boolean{
        return startColumn < 0 || startLine < -1
    }
    fun setStartLineAndColumn(startLine: Int, startColumn: Int){
        this.startLine = startLine
        this.startColumn = startColumn
    }

    fun reset(){
        expression.clear()
        isReadingString = false
        startColumn = -1
        startLine = -1
    }

    fun append(c: Char){
        this.expression.append(c)
    }

    fun build(): String{
        return this.expression.toString()
    }
    override fun toString(): String{
        return expression.toString()
    }
}