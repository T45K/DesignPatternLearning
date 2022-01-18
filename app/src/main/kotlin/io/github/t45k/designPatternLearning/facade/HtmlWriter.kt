package io.github.t45k.designPatternLearning.facade

import java.io.Writer

class HtmlWriter(private val writer: Writer) : AutoCloseable {
    fun title(title: String) {
        writer.write("<?DOCTYPE html>")
        writer.write("<html>")
        writer.write("<head>")
        writer.write("<title>$title</title>")
        writer.write("</head>")
        writer.write("<body>")
        writer.write("\n")
        writer.write("<h1>$title</h1>")
        writer.write("\n")
    }

    fun paragraph(msg: String) {
        writer.write("<p>$msg</p>")
        writer.write("\n")
    }

    fun link(href: String, caption: String) {
        paragraph("<a href=\"$href\">$caption</a>")
    }

    fun mailTo(mailAddr: String, userName: String) {
        link("mailto:$mailAddr", userName)
    }

    override fun close() {
        writer.write("</body>")
        writer.write("</html>")
        writer.write("\n")
        writer.close()
    }
}
