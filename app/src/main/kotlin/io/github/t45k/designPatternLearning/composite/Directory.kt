package io.github.t45k.designPatternLearning.composite

/**
 * Composite役
 * Componentのコレクションをフィールドに持つことで、LeafやCompositeを持てる
 */
class Directory(override val name: String) : Entry() {
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
}
