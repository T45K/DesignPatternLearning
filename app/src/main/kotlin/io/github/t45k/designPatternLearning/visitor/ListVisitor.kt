package io.github.t45k.designPatternLearning.visitor

import io.github.t45k.designPatternLearning.visitor.element.Directory
import io.github.t45k.designPatternLearning.visitor.element.File

class ListVisitor : Visitor {
    private var currentDir = ""

    override fun visit(file: File) {
        println("$currentDir/$file")
    }

    override fun visit(directory: Directory) {
        println("$currentDir/$directory")
        val saveDir = currentDir
        currentDir = "$currentDir/${directory.name}"
        for (entry in directory) {
            entry.accept(this)
        }
        currentDir = saveDir
    }
}
