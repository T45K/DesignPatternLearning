package io.github.t45k.designPatternLearning.builder

/**
 * Builder
 */
abstract class Builder {
    abstract fun makeTitle(title: String)
    abstract fun makeString(str: String)
    abstract fun makeItems(items: List<String>)
    abstract fun close()
}
