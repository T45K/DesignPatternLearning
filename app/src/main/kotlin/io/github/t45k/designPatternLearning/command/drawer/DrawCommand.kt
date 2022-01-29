package io.github.t45k.designPatternLearning.command.drawer

import io.github.t45k.designPatternLearning.command.command.Command
import java.awt.Point

/**
 * ConcreteCommand
 */
class DrawCommand(protected val drawable: Drawable, private val position: Point) : Command {
    override fun execute() {
        drawable.draw(position.x, position.y)
    }
}
