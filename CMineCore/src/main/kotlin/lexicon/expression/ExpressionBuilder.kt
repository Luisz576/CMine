package com.cmine.lexicon.expression

class ExpressionBuilder {
    private val expression = StringBuilder("")
    fun size(): Int{
        return expression.length
    }

    private var readingType = ReadingType.NOTHING
    fun readingType(): ReadingType{
        return this.readingType
    }
    fun setReadingType(type: ReadingType){
        this.readingType = type
    }

    private var startColumn = -1
    private var startLine = -1
    fun startColumn(): Int{
        return startColumn
    }
    fun startLine(): Int{
        return startLine
    }
    fun alreadyReadSomething(): Boolean{
        return this.size() > 0
    }
    fun lastCharacter(): Char{
        return this.expression.last()
    }
    fun isReading(): Boolean{
        return this.readingType != ReadingType.NOTHING
    }
    fun startReading(startLine: Int, startColumn: Int){
        this.startLine = startLine
        this.startColumn = startColumn
        this.readingType = ReadingType.SOMETHING
    }
    fun startReadingAppending(startLine: Int, startColumn: Int, c: Char){
        this.startReading(startLine, startColumn)
        this.append(c)
    }

    fun reset(){
        expression.clear()
        readingType = ReadingType.NOTHING
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