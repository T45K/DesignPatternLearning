package io.github.t45k.designPatternLearning.abstractFactory.divFactory

import io.github.t45k.designPatternLearning.abstractFactory.factory.Link

class DivLink(caption: String, url: String) : Link(caption, url) {
    override fun makeHTML(): String = "<div class=\"LINK\"><a href=\"$url\">$caption</a></div>"
}
