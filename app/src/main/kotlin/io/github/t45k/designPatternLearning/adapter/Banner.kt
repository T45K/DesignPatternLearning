package io.github.t45k.designPatternLearning.adapter

/**
 * 与えられている（再利用したい）クラス
 * アダプターをかぶせられる側
 * Adaptee
 */
open class Banner(private val string: String) {
    fun showWithParen() = println("($string)")
    fun showWithAster() = println("*$string*")
}
