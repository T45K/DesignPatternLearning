package io.github.t45k.designPatternLearning.bridge

import util.times

/**
 * 新規実装
 * ConcreteImplementor
 */
class StringDisplayImpl(private val string: String) : DisplayImpl() {
    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|$string|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        println("+${'-' * string.length}+")
    }
}
