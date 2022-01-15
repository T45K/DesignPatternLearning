package io.github.t45k.designPatternLearning.visitor.element

import io.github.t45k.designPatternLearning.visitor.Visitor

/**
 * Composite役
 * Componentのコレクションをフィールドに持つことで、LeafやCompositeを持てる
 */
class Directory(override val name: String) : Entry(), Iterable<Entry> {
    private val directory: MutableList<Entry> = mutableListOf()
    override val size: Int
        get() = directory.sumOf { it.size }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        for (entry in directory) {
            entry.printList("$prefix/$name")
        }
    }

    fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }

    override fun iterator(): Iterator<Entry> = directory.iterator()
}
