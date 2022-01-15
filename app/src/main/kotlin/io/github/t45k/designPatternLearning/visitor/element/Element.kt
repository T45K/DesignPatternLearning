package io.github.t45k.designPatternLearning.visitor.element

import io.github.t45k.designPatternLearning.visitor.Visitor

interface Element {
    fun accept(v: Visitor)
}
