package io.github.t45k.designPatternLearning.decorator

/**
 * Component
 * APIを提供する
 */
interface Display {
    val columns: Int
    val rows: Int

    fun getRowText(row: Int): String

    fun show() {
        repeat(rows) {
            println(getRowText(it))
        }
    }
}
