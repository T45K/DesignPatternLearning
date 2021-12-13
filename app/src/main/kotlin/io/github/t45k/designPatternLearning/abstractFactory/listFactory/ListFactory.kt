package io.github.t45k.designPatternLearning.abstractFactory.listFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.Factory
import io.github.t45k.designPatternLearning.abstractFactory.factory.Link
import io.github.t45k.designPatternLearning.abstractFactory.factory.Page
import io.github.t45k.designPatternLearning.abstractFactory.factory.Tray

class ListFactory : Factory() {
    override fun createLink(caption: String, url: String): Link = ListLink(caption, url)

    override fun createTray(caption: String): Tray = ListTray(caption)

    override fun createPage(title: String, author: String): Page = ListPage(title, author)
}