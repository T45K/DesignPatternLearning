package io.github.t45k.designPatternLearning.observer

class DigitObserver : Observer {
    override fun update(generator: NumberGenerator) {
        println("DigitObserver:${generator.getNumber()}")
        Thread.sleep(100)
    }
}
