package io.github.t45k.designPatternLearning.flyweight

class BigString(string: String) {
    private val bigChars: List<BigChar> =
        string.map { BigCharFactory.getBigChar(it) }

    fun print() {
        for (bigChar in bigChars) {
            bigChar.print()
        }
    }
}
