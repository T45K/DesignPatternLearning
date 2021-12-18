package io.github.t45k.designPatternLearning.abstractFactory.factory

import java.io.IOException
import java.nio.file.Files
import java.nio.file.StandardOpenOption
import kotlin.io.path.Path

/**
 * Abstract Product
 */
abstract class Page(protected val title: String, protected val author: String) {
    protected val content = mutableListOf<Item>()

    fun add(item: Item) {
        content.add(item)
    }

    fun output(fileName: String) {
        try {
            Files.writeString(
                Path(fileName), makeHTML(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE
            )
            println("$fileName を作成しました．")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    abstract fun makeHTML(): String
}
