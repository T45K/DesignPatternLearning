package io.github.t45k.designPatternLearning.abstractFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.getFactory
import kotlin.system.exitProcess

/**
 * Client
 */
fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: java Main filename.html class.name.of.ConcreteFactory")
        println("Example 1: java Main list.html listFactory.ListFactory")
        println("Example 2: java Main div.html divFactory.DivFactory")
        exitProcess(0)
    }

    val (fileName, className) = args

    val factory = getFactory(className) ?: throw RuntimeException()

    val blog1 = factory.createLink("Blog 1", "https://example.com/blog1")
    val blog2 = factory.createLink("Blog 2", "https://example.com/blog2")
    val blog3 = factory.createLink("Blog 3", "https://example.com/blog3")

    val blogTray = factory.createTray("Blog Site")
    blogTray.add(blog1)
    blogTray.add(blog2)
    blogTray.add(blog3)

    val news1 = factory.createLink("News 1", "https://example.com/news1")
    val news2 = factory.createLink("News 1", "https://example.com/news2")
    val news3 = factory.createTray("News 3")
    news3.add(factory.createLink("News3 (US)", "https://example.com/news3us"))
    news3.add(factory.createLink("News3 (JP)", "https://example.com/news3jp"))

    val newsTray = factory.createTray("News Site")
    newsTray.add(news1)
    newsTray.add(news2)
    newsTray.add(news3)

    val page = factory.createPage("Blog and News", "Hiroshi Yuki")
    page.add(blogTray)
    page.add(newsTray)

    page.output(fileName)
}
