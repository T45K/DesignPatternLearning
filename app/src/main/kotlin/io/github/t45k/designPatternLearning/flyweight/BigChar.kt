package io.github.t45k.designPatternLearning.flyweight

import java.io.IOException
import java.nio.file.Path
import kotlin.io.path.readText

class BigChar(charName: Char) {
    private val fontData: String = try {
        Path.of(
            "app",
            "src",
            "main",
            "kotlin",
            "io",
            "github",
            "t45k",
            "designPatternLearning",
            "flyweight",
            "big",
            "big$charName.txt"
        ).readText()
    } catch (e: IOException) {
        "$charName?"
    }

    fun print() {
        println(fontData)
    }
}
