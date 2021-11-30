package io.github.t45k.designPatternLearning.factoryMethod.idCard

import io.github.t45k.designPatternLearning.factoryMethod.framework.Factory
import io.github.t45k.designPatternLearning.factoryMethod.framework.Product

/**
 * Concrete Creator
 */
class IDCardFactory : Factory() {
    override fun createProduct(owner: String): Product = IDCard(owner)

    override fun registerProduct(product: Product) = println("${product}を登録しました")
}