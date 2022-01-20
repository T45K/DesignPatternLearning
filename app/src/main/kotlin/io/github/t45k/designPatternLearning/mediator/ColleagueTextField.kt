package io.github.t45k.designPatternLearning.mediator

import java.awt.Color
import java.awt.TextField
import java.awt.event.TextEvent
import java.awt.event.TextListener

class ColleagueTextField(private val mediator: Mediator, text: String, column: Int) : TextField(text, column),
    TextListener, Colleague {
    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
        background = if (enabled) Color.WHITE else Color.LIGHT_GRAY
    }

    override fun textValueChanged(e: TextEvent) {
        mediator.colleagueChanged()
    }
}
