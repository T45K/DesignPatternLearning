package io.github.t45k.designPatternLearning.strategy

import kotlin.random.Random

class ProbStrategy(seed: Int) : Strategy {
    private val random: Random
    private var prevHandValue = 0
    private var currentHandValue = 0
    private val history: Array<Array<Int>> = arrayOf(
        arrayOf(1, 1, 1),
        arrayOf(1, 1, 1),
        arrayOf(1, 1, 1),
    )

    init {
        random = Random(seed)
    }

    override fun nextHand(): Hand {
        val bet = random.nextInt(sumHistoryOfHandValue(currentHandValue))
        val handValue = when {
            bet < history[currentHandValue][0] -> 0
            bet < history[currentHandValue][0] + history[currentHandValue][1] -> 1
            else -> 2
        }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.of(handValue)
    }

    private fun sumHistoryOfHandValue(handValue: Int): Int = history[handValue].sum()

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }
    }
}
