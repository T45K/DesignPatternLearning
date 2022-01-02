package io.github.t45k.designPatternLearning.prototype.framework

/**
 * Prototype
 */
interface Product : Cloneable {
    fun use(s: String)
    fun createCopy(): Product?
}
