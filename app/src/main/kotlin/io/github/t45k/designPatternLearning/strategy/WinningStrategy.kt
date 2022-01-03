package io.github.t45k.designPatternLearning.strategy

import kotlin.random.Random

class WinningStrategy(seed: Int) : Strategy {
    private val random: Random
    private var won = false
    private lateinit var prevHand: Hand

    init {
        random = Random(seed)
    }

    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.of(random.nextInt(3))
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}