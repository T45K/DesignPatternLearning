package io.github.t45k.designPatternLearning.interpreter

abstract class Node {
    @Throws(ParseException::class)
    abstract fun parse(context: Context)
}
