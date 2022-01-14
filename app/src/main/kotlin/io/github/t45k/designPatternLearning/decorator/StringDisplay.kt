package io.github.t45k.designPatternLearning.decorator

/**
 * ConcreteComponent
 * 1行のみを持ち、それを表示する実装
 */
class StringDisplay(private val string: String) : Display {
    override val columns: Int
        get() = string.length

    override val rows: Int
        get() = 1

    override fun getRowText(row: Int): String {
        if (row != 0) {
            throw IndexOutOfBoundsException()
        }
        return string
    }
}
