package io.github.t45k.designPatternLearning.abstractFactory.divFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.Factory
import io.github.t45k.designPatternLearning.abstractFactory.factory.Link
import io.github.t45k.designPatternLearning.abstractFactory.factory.Page
import io.github.t45k.designPatternLearning.abstractFactory.factory.Tray

/**
 * Concrete Factory
 */
class DivFactory : Factory() {
    override fun createLink(caption: String, url: String): Link = DivLink(caption, url)

    override fun createTray(caption: String): Tray = DivTray(caption)

    override fun createPage(title: String, author: String): Page = DivPage(title, author)
}