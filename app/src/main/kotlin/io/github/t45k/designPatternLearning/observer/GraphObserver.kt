package io.github.t45k.designPatternLearning.observer

import util.times

class GraphObserver : Observer {
    override fun update(generator: NumberGenerator) {
        println("GraphObserver:${'*' * generator.getNumber()}")
        Thread.sleep(100)
    }
}
