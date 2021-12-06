package io.github.t45k.designPatternLearning.prototype

import io.github.t45k.designPatternLearning.prototype.framework.Manager

fun main() {
    val manager = Manager()
    val underlinePen = UnderlinePen('-')
    val mBox = MessageBox('*')
    val sBox = MessageBox('/')

    manager.register("strong message", underlinePen)
    manager.register("warning box", mBox)
    manager.register("slash box", sBox)

    manager.create("strong message").use("Hello world.")
    manager.create("warning box").use("Hello world.")
    manager.create("slash box").use("Hello world.")
}
