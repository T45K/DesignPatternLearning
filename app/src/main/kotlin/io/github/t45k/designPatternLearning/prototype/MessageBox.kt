package io.github.t45k.designPatternLearning.prototype

import io.github.t45k.designPatternLearning.prototype.framework.Product
import util.times

/**
 * Concrete Prototype
 */
class MessageBox(private val decorator: Char) : Product {
    override fun use(s: String) {
        val decoLen = 1 + s.length + 1
        println(decorator * decoLen)
        println(decorator + s + decorator)
        println(decorator * decoLen)
    }

    override fun createCopy(): Product? = try {
        clone() as MessageBox
    } catch (e: CloneNotSupportedException) {
        e.printStackTrace()
        null
    }
}
