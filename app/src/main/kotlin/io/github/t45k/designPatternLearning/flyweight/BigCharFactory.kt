package io.github.t45k.designPatternLearning.flyweight

object BigCharFactory {
    private val pool = mutableMapOf<String, BigChar>()

    @Synchronized
    fun getBigChar(charName: Char): BigChar =
        pool.computeIfAbsent(charName.toString()) { BigChar(charName) }
}
