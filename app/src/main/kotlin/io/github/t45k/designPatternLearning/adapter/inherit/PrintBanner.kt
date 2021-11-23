package io.github.t45k.designPatternLearning.adapter.inherit

import io.github.t45k.designPatternLearning.adapter.Banner

/**
 * 継承を用いたアダプター
 * 自分のプログラム側からはPrintインターフェースに見えるが処理自体はBannerがしている
 */
class PrintBanner(string: String) : Banner(string), Print {
    override fun printWeak() = super.showWithParen()
    override fun printStrong() = super.showWithAster()
}
