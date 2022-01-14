package io.github.t45k.designPatternLearning.decorator

fun main() {
    val b1 = StringDisplay("Hello, world.")
    val b2 = SideBorder(b1, '#')
    val b3 = FullBorder(b2)
    b1.show()
    b2.show()
    b3.show()

    val b4 = StringDisplay("Hello, world.")
        .let { FullBorder(it) }
        .let { SideBorder(it, '*') }
        .let { FullBorder(it) }
        .let { SideBorder(it, '/') }
    b4.show()
}
