package io.github.t45k.designPatternLearning.command.drawer

import io.github.t45k.designPatternLearning.command.command.MacroCommand
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics

/**
 * Receiver, Invoker
 */
class DrawCanvas(width: Int, height: Int, private val history: MacroCommand) : Canvas(), Drawable {
    companion object {
        private val color = Color.RED
        private const val radius = 6
    }

    init {
        super.setSize(width, height)
        super.setBackground(Color.WHITE)
    }

    override fun paint(g: Graphics?) {
        history.execute()
    }

    override fun draw(x: Int, y: Int) {
        val g = super.getGraphics()
        g.color = color
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2)
    }
}
