package io.github.t45k.designPatternLearning.abstractFactory.factory

/**
 * Abstract Factory
 */
abstract class Factory {
    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}

fun getFactory(className: String): Factory? =
    try {
        Class.forName(className)
            .getDeclaredConstructor()
            .newInstance() as Factory
    } catch (e: ClassNotFoundException) {
        println("クラス $className が見つかりません．")
        null
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
