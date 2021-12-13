package io.github.t45k.designPatternLearning.abstractFactory.divFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.Page

class DivPage(title: String, author: String) : Page(title, author) {
    override fun makeHTML(): String = """
        |<!DOCTYPE html>
        |<html><head><title>
        |$title
        |</title><style>
        |div.TRAY { padding:0.5em; margin-left:5em; border:1px solid black; }
        |div.LINK { padding:0.5em; background-color: lightgray; }
        |</style></head><body>
        |<h1>
        |$title
        |</h1>
        |${content.joinToString("\n") { it.makeHTML() }}
        |<hr><address>
        |$author
        |</address>
        |</body></html>
        """.trimMargin()
}
