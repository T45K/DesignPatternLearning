package io.github.t45k.designPatternLearning.decorator

class SideBorder(display: Display, private val borderChar: Char) : Border(display) {
    override val columns: Int
        get() = 1 + display.columns + 1

    override val rows: Int
        get() = display.rows

    override fun getRowText(row: Int): String =
        borderChar + display.getRowText(row) + borderChar
}
