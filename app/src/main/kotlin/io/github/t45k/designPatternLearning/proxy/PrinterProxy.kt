package io.github.t45k.designPatternLearning.proxy

class PrinterProxy(name: String = "No Name") : Printable {
    override var printerName: String = name
        set(printerName) {
            real?.printerName = printerName
            field = printerName
        }
    private var real: Printer? = null

    @Synchronized
    override fun print(string: String) {
        realize()
        real?.print(string)
    }

    private fun realize() {
        if (real == null) {
            real = Printer(printerName)
        }
    }
}
