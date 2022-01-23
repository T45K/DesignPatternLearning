package io.github.t45k.designPatternLearning.memento

import kotlin.random.Random

/**
 * Originator
 * Mementoを作成する
 */
class Gamer(var money: Int) {
    companion object {
        private val fruitsName = arrayOf("リンゴ", "ぶどう", "バナナ", "みかん")
    }

    private var fruits: MutableList<String> = mutableListOf()
    private val random = Random.Default

    fun bet() {
        when (random.nextInt(6) + 1) {
            1 -> {
                money += 100
                println("所持金が増えました。")
            }
            2 -> {
                money /= 2
                println("所持金が半分になりました。")
            }
            6 -> {
                val f = getFruit()
                println("フルーツ($f)をもらいました。")
                fruits.add(f)
            }
            else -> println("何も起こりませんでした。")
        }
    }

    fun createMemento(): Memento =
        Memento(money, fruits.filter { it.startsWith("おいしい") }.toMutableList())

    fun restoreMemento(memento: Memento) {
        this.money = memento.money
        this.fruits = memento.fruits
    }

    override fun toString(): String = "[money = $money, fruits = $fruits]"

    private fun getFruit(): String =
        fruitsName[random.nextInt(fruitsName.size)].letIf(random.nextBoolean()) { "おいしい$it" }


    private fun <T> T.letIf(exp: Boolean, block: (T) -> T): T =
        if (exp) {
            block(this)
        } else {
            this
        }
}
