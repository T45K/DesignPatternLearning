package io.github.t45k.designPatternLearning.abstractFactory.listFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.Link

class ListLink(caption: String, url: String) : Link(caption, url) {

    override fun makeHTML(): String = " <li><a href=\"${url}\">${caption}</a></li>\n"
}