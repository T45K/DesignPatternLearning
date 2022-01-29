package io.github.t45k.designPatternLearning.interpreter

import kotlin.io.path.Path
import kotlin.io.path.readLines

fun main() {
    try {
        Path(
            "app",
            "src",
            "main",
            "kotlin",
            "io",
            "github",
            "t45k",
            "designPatternLearning",
            "interpreter",
            "program.txt"
        )
            .readLines()
            .forEach {
                println("text=\"$it\"")
                val node = ProgramNode()
                node.parse(Context(it))
                println("node = $node")
            }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
