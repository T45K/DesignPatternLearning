package io.github.t45k.designPatternLearning.bridge

/**
 * 機能追加
 * RefinedAbstraction
 */
class CountDisplay(impl: DisplayImpl) : Display(impl) {
    fun multiDisplay(times: Int) {
        open()
        repeat(times) {
            print()
        }
        close()
    }
}
