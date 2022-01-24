package io.github.t45k.designPatternLearning.state

interface Context {
    fun setClock(hour: Int)
    fun changeState(state: State)
    fun callSecurityCenter(msg: String)
    fun recordLog(msg: String)
}
