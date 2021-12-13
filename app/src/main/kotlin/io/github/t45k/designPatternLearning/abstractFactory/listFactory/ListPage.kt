package io.github.t45k.designPatternLearning.abstractFactory.listFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.Page

class ListPage(title: String, author: String) : Page(title, author) {
    override fun makeHTML(): String = StringBuilder()
        .append("<!DOCTYPE html>\n")
        .append("<html><head><title>")
        .append(title)
        .append("</title></head>\n")
        .append("<body>\n")
        .append("<h1>")
        .append(title)
        .append("<h1>\n")
        .append("<ul>\n")
        .append(content.joinToString("") { it.makeHTML() })
        .append("</ul>\n")
        .append("<hr><address>")
        .append(author)
        .append("</address>\n")
        .append("</body></html>\n")
        .toString()
}
