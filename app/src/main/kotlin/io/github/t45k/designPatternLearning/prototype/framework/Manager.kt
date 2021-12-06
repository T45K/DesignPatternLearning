package io.github.t45k.designPatternLearning.prototype.framework

/**
 * Client
 */
class Manager {
    private val showcase: MutableMap<String, Product> = mutableMapOf()

    fun register(name: String, prototype: Product) {
        showcase[name] = prototype
    }

    fun create(prototypeName: String): Product = showcase[prototypeName]?.createCopy() ?: throw RuntimeException()
}
