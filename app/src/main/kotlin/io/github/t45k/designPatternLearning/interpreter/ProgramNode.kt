package io.github.t45k.designPatternLearning.interpreter

// <program> ::= program <command list>
class ProgramNode : Node() {
    private lateinit var commandListNode: Node

    @Throws(ParseException::class)
    override fun parse(context: Context) {
        context.skipToken("program")
        commandListNode = CommandListNode()
        commandListNode.parse(context)
    }

    override fun toString(): String = "[program$commandListNode]"
}
