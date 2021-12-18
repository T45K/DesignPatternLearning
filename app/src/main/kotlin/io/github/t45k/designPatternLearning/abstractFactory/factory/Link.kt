package io.github.t45k.designPatternLearning.abstractFactory.factory

/**
 * Abstract Product
 */
abstract class Link(caption: String, protected val url: String) : Item(caption)
