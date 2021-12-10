package io.github.t45k.designPatternLearning.builder

import java.io.FileWriter
import java.io.IOException

class HTMLBuilder : Builder() {
    private lateinit var fileName: String
    private val sb = StringBuilder()

    override fun makeTitle(title: String) {
        fileName = "$title.html"
        sb.append("<!DOCTYPE html>\n")
            .append("<html>\n")
            .append("<head><title>")
            .append(title)
            .append("</title></head>\n")
            .append("<body>\n")
            .append("<h1>")
            .append(title)
            .append("</h1>\n\n")
    }

    override fun makeString(str: String) {
        sb.append("<p>")
            .append(str)
            .append("</p>\n\n")
    }

    override fun makeItems(items: List<String>) {
        sb.append("<ul>")
            .append(items.joinToString("") { "<li>${it}</li>\n" })
            .append("</ul>\n\n")
    }

    override fun close() {
        sb.append("</body>")
            .append("</html>")
        try {
            FileWriter(fileName).use { it.write(sb.toString()) }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun getHTMLResult() = fileName
}