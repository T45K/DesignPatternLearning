package io.github.t45k.designPatternLearning.chainOfResponsibility.support

import io.github.t45k.designPatternLearning.chainOfResponsibility.Trouble

class NoSupport(name: String) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean = false
}
