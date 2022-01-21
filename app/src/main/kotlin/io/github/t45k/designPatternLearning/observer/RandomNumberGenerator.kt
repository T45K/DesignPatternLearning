package io.github.t45k.designPatternLearning.observer

import kotlin.random.Random

class RandomNumberGenerator : NumberGenerator() {
    private val random = Random.Default
    private var number = 0

    override fun getNumber() = number

    override fun execute() {
        repeat(20) {
            number = random.nextInt(50)
            notifyObservers()
        }
    }
}
