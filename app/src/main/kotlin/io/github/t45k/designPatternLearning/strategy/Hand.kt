package io.github.t45k.designPatternLearning.strategy

enum class Hand(val handName: String) {
    ROCK("グー"),
    SCISSORS("チョキ"),
    PAPER("パー");

    companion object {
        fun of(ordinal: Int): Hand = values()[ordinal]
    }

    fun isStrongerThan(h: Hand): Boolean = (this.ordinal + 1) % 3 == h.ordinal
}
