package io.github.t45k.designPatternLearning.bridge

/**
 * 基底クラス
 * implが橋の役割を果たす
 * Abstraction
 */
open class Display(private val impl: DisplayImpl) {
    protected fun open() {
        impl.rawOpen()
    }

    protected fun print() {
        impl.rawPrint()
    }

    protected fun close() {
        impl.rawClose()
    }

    fun display() {
        open()
        print()
        close()
    }
}
