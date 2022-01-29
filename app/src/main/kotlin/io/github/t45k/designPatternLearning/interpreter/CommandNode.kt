package io.github.t45k.designPatternLearning.interpreter

// <command> ::= <repeat command> | <primitive command>
class CommandNode : Node() {
    private lateinit var node: Node

    @Throws(ParseException::class)
    override fun parse(context: Context) {
        node = if (context.currentToken() == "repeat") {
            RepeatCommandNode()
        } else {
            PrimitiveCommandNode()
        }
        node.parse(context)
    }

    override fun toString(): String = node.toString()
}
