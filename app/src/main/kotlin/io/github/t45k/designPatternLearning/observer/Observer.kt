package io.github.t45k.designPatternLearning.observer

interface Observer {
    fun update(generator: NumberGenerator)
}
