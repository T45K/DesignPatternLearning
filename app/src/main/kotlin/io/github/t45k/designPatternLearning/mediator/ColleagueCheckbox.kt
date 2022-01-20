package io.github.t45k.designPatternLearning.mediator

import java.awt.Checkbox
import java.awt.CheckboxGroup
import java.awt.event.ItemEvent
import java.awt.event.ItemListener

class ColleagueCheckbox(
    private val mediator: Mediator,
    caption: String,
    group: CheckboxGroup,
    state: Boolean
) : Checkbox(caption, group, state), ItemListener, Colleague {
    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
    }

    override fun itemStateChanged(e: ItemEvent?) {
        mediator.colleagueChanged()
    }
}
