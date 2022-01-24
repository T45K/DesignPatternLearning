package io.github.t45k.designPatternLearning.state

import java.awt.BorderLayout
import java.awt.Button
import java.awt.Color
import java.awt.Frame
import java.awt.Panel
import java.awt.TextArea
import java.awt.TextField
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import kotlin.system.exitProcess

class SafeFrame(title: String) : Frame(title), ActionListener, Context {
    private val textClock = TextField(60)
    private val textScreen = TextArea(10, 60)
    private val buttonUse = Button("金庫使用")
    private val buttonAlarm = Button("非常ベル")
    private val buttonPhone = Button("通常通話")
    private val buttonExit = Button("終了")

    private var state: State = DayState

    init {
        background = Color.LIGHT_GRAY
        layout = BorderLayout()

        add(textClock, BorderLayout.NORTH)
        textClock.isEditable = false

        add(textScreen, BorderLayout.CENTER)
        textScreen.isEditable = false

        val panel = Panel().apply {
            add(buttonUse)
            add(buttonAlarm)
            add(buttonPhone)
            add(buttonExit)
        }
        add(panel, BorderLayout.SOUTH)

        pack()
        isVisible = true

        buttonUse.addActionListener { state.doUse(this) }
        buttonAlarm.addActionListener { state.doAlarm(this) }
        buttonPhone.addActionListener { state.doPhone(this) }
        buttonExit.addActionListener { exitProcess(0) }
    }

    override fun actionPerformed(e: ActionEvent?) {
        println(e?.toString())
    }

    override fun setClock(hour: Int) {
        val clockString = String.format("現在時刻は%02d:00", hour)
        println(clockString)
        textClock.text = clockString
        state.doClock(this, hour)
    }

    override fun changeState(state: State) {
        println("${this.state}から${state}へ状態が変化し巻いた。")
        this.state = state
    }

    override fun callSecurityCenter(msg: String) {
        textScreen.append("call! $msg\n")
    }

    override fun recordLog(msg: String) {
        textScreen.append("record ... $msg\n")
    }
}
