package io.github.t45k.designPatternLearning.factoryMethod.framework

/**
 * Creator
 */
abstract class Factory {

    fun create(owner: String): Product = createProduct(owner).also(this::registerProduct)

    protected abstract fun createProduct(owner: String): Product
    protected abstract fun registerProduct(product: Product)
}
