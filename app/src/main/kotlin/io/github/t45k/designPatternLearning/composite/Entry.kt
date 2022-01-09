package io.github.t45k.designPatternLearning.composite

/**
 * Component役
 * LeafとCompositeの共通の親クラス
 */
abstract class Entry {
    abstract val name: String
    abstract val size: Int

    fun printList() {
        printList("")
    }

    abstract fun printList(prefix: String)

    override fun toString(): String = "$name ($size)"
}
