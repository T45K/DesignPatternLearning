package io.github.t45k.designPatternLearning.factoryMethod.idCard

import io.github.t45k.designPatternLearning.factoryMethod.framework.Product

/**
 * Concrete Product
 */
class IDCard(private val owner: String) : Product() {
    init {
        println("${owner}のカードを作ります")
    }

    override fun use() = println("${this}を使います")

    override fun toString(): String = "[IDCard:${owner}]"
}