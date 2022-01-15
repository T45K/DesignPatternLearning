package io.github.t45k.designPatternLearning.visitor

import io.github.t45k.designPatternLearning.visitor.element.Directory
import io.github.t45k.designPatternLearning.visitor.element.File

class ImmutableListVisitor(private val currentDir: String) : Visitor {
    override fun visit(file: File) {
        println("$currentDir/$file")
    }

    override fun visit(directory: Directory) {
        println("$currentDir/$directory")
        val visitor = ImmutableListVisitor("$currentDir/${directory.name}")
        for (entry in directory) {
            entry.accept(visitor)
        }
    }
}
