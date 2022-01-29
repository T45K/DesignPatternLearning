package io.github.t45k.designPatternLearning.interpreter

// <repeat command> ::= repeat <number> <command list>
class RepeatCommandNode : Node() {
    private var number: Int = 0
    private lateinit var commandListNode: Node

    @Throws(ParseException::class)
    override fun parse(context: Context) {
        context.skipToken("repeat")
        number = context.currentNumber()
        context.nextToken()
        commandListNode = CommandListNode()
        commandListNode.parse(context)
    }

    override fun toString(): String = "[repeat $number $commandListNode]"
}
