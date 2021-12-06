package io.github.t45k.designPatternLearning.prototype

import io.github.t45k.designPatternLearning.prototype.framework.Product

/**
 * Concrete Prototype
 */
class UnderlinePen(private val ulChar: Char) : Product {
    override fun use(s: String) {
        val uLen = s.length
        println(s)
        println(ulChar * uLen)
    }

    override fun createCopy(): Product? = try {
        clone() as Product
    } catch (e: CloneNotSupportedException) {
        e.printStackTrace()
        null
    }
}
