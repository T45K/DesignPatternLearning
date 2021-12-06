package io.github.t45k.designPatternLearning.prototype.framework

/**
 * Prototype
 */
interface Product : Cloneable {
    fun use(s: String)
    fun createCopy(): Product?

    operator fun Char.times(v: Int): String = this.toString().repeat(v)
}
