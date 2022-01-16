package io.github.t45k.designPatternLearning.chainOfResponsibility

import io.github.t45k.designPatternLearning.chainOfResponsibility.support.LimitSupport
import io.github.t45k.designPatternLearning.chainOfResponsibility.support.NoSupport
import io.github.t45k.designPatternLearning.chainOfResponsibility.support.OddSupport
import io.github.t45k.designPatternLearning.chainOfResponsibility.support.SpecialSupport

fun main() {
    val alice = NoSupport("Alice")
    val bob = LimitSupport("Bob", 100)
    val charlie = SpecialSupport("Charlie", 429)
    val diana = LimitSupport("Diana", 200)
    val elmo = OddSupport("Elmo")
    val fred = LimitSupport("Fred", 300)

    alice.setNext(bob)
        .setNext(charlie)
        .setNext(diana)
        .setNext(elmo)
        .setNext(fred)

    for (i in 0 until 500) {
        alice.support(Trouble(i))
    }
}
