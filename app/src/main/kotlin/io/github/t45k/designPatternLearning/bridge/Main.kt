package io.github.t45k.designPatternLearning.bridge

fun main() {
    val d1 = Display(StringDisplayImpl("Hello, Japan."))
    val d2 = CountDisplay(StringDisplayImpl("Hello, World."))
    val d3 = CountDisplay(StringDisplayImpl("Hello, Universe."))
    d1.display()
    d2.display()
    d3.display()
    d3.multiDisplay(5)
}
