package io.github.t45k.designPatternLearning.bridge

/**
 * Implementor
 */
abstract class DisplayImpl {
    abstract fun rawOpen()
    abstract fun rawPrint()
    abstract fun rawClose()
}
