package io.github.t45k.designPatternLearning.abstractFactory.listFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.Tray

class ListTray(caption: String) : Tray(caption) {

    override fun makeHTML(): String = StringBuilder()
        .append("<li>\n")
        .append(caption)
        .append("\n<ul>\n")
        .append(tray.joinToString("") { it.makeHTML() })
        .append("</ul>\n")
        .append("</li>\n")
        .toString()
}
