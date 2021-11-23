package io.github.t45k.designPatternLearning.adapter

import io.github.t45k.designPatternLearning.adapter.delegate.Print as DelegatePrint
import io.github.t45k.designPatternLearning.adapter.delegate.PrintBanner as DelegatePrintBanner
import io.github.t45k.designPatternLearning.adapter.inherit.Print as InheritPrint
import io.github.t45k.designPatternLearning.adapter.inherit.PrintBanner as InheritPrintBanner

/**
 * Client
 */
fun main() {
    val inheritPrint: InheritPrint = InheritPrintBanner("Hello")
    inheritPrint.printWeak()
    inheritPrint.printStrong()

    println()

    val delegatePrint: DelegatePrint = DelegatePrintBanner("Hello")
    delegatePrint.printWeak()
    delegatePrint.printStrong()
}
