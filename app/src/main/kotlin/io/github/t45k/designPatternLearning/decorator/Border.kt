package io.github.t45k.designPatternLearning.decorator

/**
 * Decorator
 * 処理を引数のComponentに委譲する
 */
abstract class Border(protected val display: Display) : Display
