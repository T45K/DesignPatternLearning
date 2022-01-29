package io.github.t45k.designPatternLearning.proxy

fun main() {
    val p = PrinterProxy("Alice")
    println("名前は現在${p.printerName}です。")
    p.printerName = "Bob"
    println("名前は現在${p.printerName}です。")
    p.print("Hello, world.")
}
