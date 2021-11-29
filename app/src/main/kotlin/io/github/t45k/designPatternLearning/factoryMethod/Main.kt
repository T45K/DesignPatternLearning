package io.github.t45k.designPatternLearning.factoryMethod

import io.github.t45k.designPatternLearning.factoryMethod.idCard.IDCardFactory

fun main() {
    val factory = IDCardFactory()
    val card1 = factory.create("Hiroshi Yuki")
    val card2 = factory.create("Tomura")
    val card3 = factory.create("Hanako Sato")
    card1.use()
    card2.use()
    card3.use()
}
