package io.github.t45k.designPatternLearning.composite

/**
 * Leaf役
 */
class File(override val name: String, override val size: Int) : Entry() {
    override fun printList(prefix: String) {
        println("$prefix/$this")
    }
}
