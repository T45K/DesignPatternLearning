package io.github.t45k.designPatternLearning.templateMethod

/**
 * インターフェースでもいけるが，インターフェースだと未実装メソッドの可視性がpublicになる
 */
abstract class AbstractDisplay {
    protected abstract fun open()
    protected abstract fun print()
    protected abstract fun close()

    fun display() {
        open()
        repeat(5) {
            print()
        }
        close()
    }
}
