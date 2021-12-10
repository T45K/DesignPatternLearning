package io.github.t45k.designPatternLearning.builder

class Director(private val builder: Builder) {
    fun construct() {
        builder.run {
            makeTitle("Greeting")
            makeString("一般的な挨拶")
            makeItems(listOf("How are you?", "Hello.", "Hi"))
            makeString("時間帯に応じたあいさつ")
            makeItems(listOf("Good morning.", "Good afternoon.", "Good evening."))
            close()
        }
    }
}
