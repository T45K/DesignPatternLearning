package io.github.t45k.designPatternLearning.abstractFactory.factory

/**
 * Abstract Product
 */
abstract class Tray(caption: String) : Item(caption) {
    protected val tray = mutableListOf<Item>()

    fun add(item: Item) {
        tray.add(item)
    }
}
