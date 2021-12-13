package io.github.t45k.designPatternLearning.abstractFactory.divFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.Tray

class DivTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String = """
        |<p><b>
        |$caption
        |</b></p>
        |<div class="TRAY">
        |${tray.joinToString("\n") { it.makeHTML() }}
        |</div>
        """.trimMargin()
}
