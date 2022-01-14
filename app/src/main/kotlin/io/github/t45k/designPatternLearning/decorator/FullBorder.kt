package io.github.t45k.designPatternLearning.decorator

import util.times

class FullBorder(display: Display) : Border(display) {
    override val columns: Int
        get() = 1 + display.columns + 1

    override val rows: Int
        get() = 1 + display.rows + 1

    override fun getRowText(row: Int): String =
        when (row) {
            0, display.rows + 1 -> "+${'-' * display.columns}+"
            else -> "|${display.getRowText(row - 1)}|"
        }
}
