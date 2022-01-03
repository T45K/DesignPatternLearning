package io.github.t45k.designPatternLearning.strategy

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: java Main randomSeed1 randomSeed2")
        println("Example: java Main 314 15")
        exitProcess(0)
    }

    val (seed1, seed2) = args.map { it.toInt() }

    val player1 = Player("Taro", WinningStrategy(seed1))
    val player2 = Player("Hana", ProbStrategy(seed2))

    repeat(10000) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()
        when {
            nextHand1.isStrongerThan(nextHand2) -> {
                println("Winner: $player1")
                player1.win()
                player2.lose()
            }
            nextHand2.isStrongerThan(nextHand1) -> {
                println("Winner: $player2")
                player2.win()
                player1.lose()
            }
            else -> {
                println("Even...")
                player1.even()
                player2.even()
            }
        }
    }

    println("Total result:")
    println(player1)
    println(player2)
}
