package io.github.t45k.designPatternLearning.interpreter

// <primitive command> ::= go | right | left
class PrimitiveCommandNode : Node() {
    private lateinit var name: String

    @Throws(ParseException::class)
    override fun parse(context: Context) {
        val name = context.currentToken()
        this.name = when (name) {
            "go", "right", "left" -> name
            null -> throw ParseException("Error: Missing <primitive command>")
            else -> throw ParseException("Error: Unknown <primitive command>: '${name}'")
        }
        context.skipToken(name)
    }

    override fun toString(): String = name
}
