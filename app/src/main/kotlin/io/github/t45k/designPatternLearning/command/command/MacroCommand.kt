package io.github.t45k.designPatternLearning.command.command

/**
 * ConcreateCommand
 */
class MacroCommand : Command {
    private val commands = ArrayDeque<Command>()

    override fun execute() {
        commands.forEach { it.execute() }
    }

    fun append(cmd: Command) {
        if (cmd == this) {
            throw IllegalArgumentException("infinite loop caused by append")
        }
        commands.addLast(cmd)
    }

    fun undo() {
        if (commands.isNotEmpty()) {
            commands.removeLast()
        }
    }

    fun clear() {
        commands.clear()
    }
}
