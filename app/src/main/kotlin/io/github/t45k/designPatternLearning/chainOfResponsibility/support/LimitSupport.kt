package io.github.t45k.designPatternLearning.chainOfResponsibility.support

import io.github.t45k.designPatternLearning.chainOfResponsibility.Trouble

class LimitSupport(name: String, private val limit: Int) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean = trouble.number < limit
}
