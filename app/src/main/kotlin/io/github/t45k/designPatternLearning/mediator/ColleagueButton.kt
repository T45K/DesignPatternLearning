package io.github.t45k.designPatternLearning.mediator

import java.awt.Button

class ColleagueButton(private val mediator: Mediator, caption: String) : Button(caption), Colleague {
    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
    }
}
