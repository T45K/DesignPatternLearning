package io.github.t45k.designPatternLearning.chainOfResponsibility.support

import io.github.t45k.designPatternLearning.chainOfResponsibility.Trouble

class SpecialSupport(name: String, private val number: Int) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean = trouble.number == number
}
