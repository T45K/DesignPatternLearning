package io.github.t45k.designPatternLearning.interpreter

// <command list> :::= <command>* end
class CommandListNode : Node() {
    private val list = mutableListOf<Node>()

    @Throws(ParseException::class)
    override fun parse(context: Context) {
        while (true) {
            when (context.currentToken()) {
                null -> throw ParseException("Error: Missing 'end'")
                "end" -> {
                    context.skipToken("end")
                    break
                }
                else -> {
                    val commandNode = CommandNode().apply { parse(context) }
                    list.add(commandNode)
                }
            }
        }
    }

    override fun toString(): String = list.toString()
}
