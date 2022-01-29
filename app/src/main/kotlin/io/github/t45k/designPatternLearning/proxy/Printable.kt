package io.github.t45k.designPatternLearning.proxy

interface Printable {
    var printerName: String
    fun print(string: String)
}
