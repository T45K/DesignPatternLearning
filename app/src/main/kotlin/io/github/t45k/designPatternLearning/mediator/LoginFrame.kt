package io.github.t45k.designPatternLearning.mediator

import java.awt.CheckboxGroup
import java.awt.Color
import java.awt.Frame
import java.awt.GridLayout
import java.awt.Label
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import kotlin.system.exitProcess

class LoginFrame(title: String) : Frame(title), ActionListener, Mediator {
    private lateinit var checkGuest: ColleagueCheckbox
    private lateinit var checkLogin: ColleagueCheckbox
    private lateinit var textUser: ColleagueTextField
    private lateinit var textPass: ColleagueTextField
    private lateinit var buttonOk: ColleagueButton
    private lateinit var buttonCancel: ColleagueButton

    init {
        background = Color.LIGHT_GRAY
        layout = GridLayout(4, 2)
        createColleagues()

        add(checkGuest)
        add(checkLogin)
        add(Label("Username:"))
        add(textUser)
        add(Label("Password:"))
        add(textPass)
        add(buttonOk)
        add(buttonCancel)

        colleagueChanged()

        pack()
        isVisible = true
    }

    override fun createColleagues() {
        val g = CheckboxGroup()
        checkGuest = ColleagueCheckbox(this, "Guest", g, true).apply { addItemListener(this) }
        checkLogin = ColleagueCheckbox(this, "Login", g, false).apply { addItemListener(this) }

        textUser = ColleagueTextField(this, "", 10).apply { addTextListener(this) }
        textPass = ColleagueTextField(this, "", 10)
            .apply { echoChar = '*' }
            .apply { addTextListener(this) }

        buttonOk = ColleagueButton(this, "OK").apply { addActionListener(this@LoginFrame) }
        buttonCancel = ColleagueButton(this, "Cancel").apply { addActionListener(this@LoginFrame) }
    }

    override fun colleagueChanged() {
        if (checkGuest.state) {
            textUser.setColleagueEnabled(false)
            textPass.setColleagueEnabled(false)
            buttonOk.setColleagueEnabled(true)
        } else {
            textUser.setColleagueEnabled(true)
            userPassChanged()
        }
    }

    private fun userPassChanged() {
        if (textUser.text.isNotEmpty()) {
            textPass.setColleagueEnabled(true)
            buttonOk.setColleagueEnabled(textUser.text.isNotEmpty())
        } else {
            textUser.setColleagueEnabled(false)
            buttonOk.setColleagueEnabled(false)
        }
    }

    override fun actionPerformed(e: ActionEvent?) {
        println(e!!.toString())
        exitProcess(0)
    }
}
