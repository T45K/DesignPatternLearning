package io.github.t45k.designPatternLearning.visitor.element

import io.github.t45k.designPatternLearning.visitor.Visitor

/**
 * Leaf役
 */
class File(override val name: String, override val size: Int) : Entry() {
    override fun printList(prefix: String) {
        println("$prefix/$this")
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}
