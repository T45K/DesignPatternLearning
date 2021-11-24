package io.github.t45k.designPatternLearning.templateMethod

class StringDisplay(private val string: String) : AbstractDisplay() {
    private val width = string.length

    override fun open() = printLine()

    override fun print() = println("|$string|")

    override fun close() = printLine()

    private fun printLine() = println("+${"-".repeat(width)}+")
}
