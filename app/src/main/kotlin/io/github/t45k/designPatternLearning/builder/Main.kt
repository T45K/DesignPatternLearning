package io.github.t45k.designPatternLearning.builder

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        usage()
        exitProcess(0)
    }

    when (args[0]) {
        "text" -> {
            val builder = TextBuilder()
            val director = Director(builder)
            director.construct()
            println(builder.getTextResult())
        }
        "html" -> {
            val builder = HTMLBuilder()
            val director = Director(builder)
            director.construct()
            println(builder.getHTMLResult())
        }
        else -> {
            usage()
            exitProcess(0)
        }
    }
}

fun usage() {
    println("Usage: java Main text     テキストで文書生成")
    println("Usage: java Main html     HTMLで文書生成")
}
