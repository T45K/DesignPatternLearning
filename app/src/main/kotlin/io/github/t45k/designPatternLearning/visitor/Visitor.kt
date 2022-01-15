package io.github.t45k.designPatternLearning.visitor

import io.github.t45k.designPatternLearning.visitor.element.Directory
import io.github.t45k.designPatternLearning.visitor.element.File

interface Visitor {
    fun visit(file: File)
    fun visit(directory: Directory)
}
