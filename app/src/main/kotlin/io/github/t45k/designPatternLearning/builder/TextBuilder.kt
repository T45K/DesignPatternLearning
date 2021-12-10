package io.github.t45k.designPatternLearning.builder

class TextBuilder : Builder() {
    private val sb = StringBuilder()

    override fun makeTitle(title: String) {
        sb.append("================================\n")
            .append("『")
            .append(title)
            .append("』\n\n")
    }

    override fun makeString(str: String) {
        sb.append("■")
            .append(str)
            .append("\n\n")
    }

    override fun makeItems(items: List<String>) {
        sb.append(items.joinToString("") { "  ・$it\n" })
            .append("\n")
    }

    override fun close() {
        sb.append("================================\n")
    }

    fun getTextResult() = sb.toString()
}
