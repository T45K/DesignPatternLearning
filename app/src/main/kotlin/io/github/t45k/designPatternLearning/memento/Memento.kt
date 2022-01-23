package io.github.t45k.designPatternLearning.memento

/**
 * Memento
 *
 * コンストラクタはwide interface
 */
data class Memento(
    /**
     * getterはnarrow interface
     *
     * 情報を見せるためだけのinterface
     * publicでも良い
     * 内部情報を変更できない
     */
    val money: Int,
    /**
     * getterはwide interface
     *
     * Mementoの作成のためのみにOriginatorから利用される
     * package-privateにしておく
     */
    val fruits: MutableList<String>
)
