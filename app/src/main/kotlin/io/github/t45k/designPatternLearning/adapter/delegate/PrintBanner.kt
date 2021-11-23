package io.github.t45k.designPatternLearning.adapter.delegate

import io.github.t45k.designPatternLearning.adapter.Banner

/**
 * 移譲を用いたアダプター
 * Printが抽象クラスのため，Bannerを継承できない
 */
class PrintBanner(string: String) : Print() {
    private val banner = Banner(string)

    override fun printWeak() = banner.showWithParen()
    override fun printStrong() = banner.showWithAster()
}