package io.github.t45k.designPatternLearning.strategy

interface Strategy {
    fun nextHand(): Hand
    fun study(win: Boolean)
}
