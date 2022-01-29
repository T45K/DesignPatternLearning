package io.github.t45k.designPatternLearning.proxy

class Printer(override var printerName: String) : Printable {

    init {
        heavyJob("Printerのインスタンス($printerName)を生成中")
    }

    override fun print(string: String) {
        println("=== $printerName ===")
        println(string)
    }

    private fun heavyJob(msg: String) {
        println(msg)
        repeat(5) {
            Thread.sleep(1000)
            kotlin.io.print(".")
        }
        println("完了。")
    }
}
