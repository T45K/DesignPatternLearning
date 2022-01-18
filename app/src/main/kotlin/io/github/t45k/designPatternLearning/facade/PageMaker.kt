package io.github.t45k.designPatternLearning.facade

import java.io.FileWriter
import java.io.IOException

/**
 * facade
 */
class PageMaker private constructor() {
    companion object {
        fun makeWelcomePage(mailAddr: String, fileName: String) {
            try {
                val mailProp =
                    Database.getProperties("app/src/main/kotlin/io/github/t45k/designPatternLearning/facade/maildata")
                val userName = mailProp.getProperty(mailAddr)
                val writer = HtmlWriter(FileWriter(fileName))
                writer.title("$userName's web page")
                writer.paragraph("Welcome to $userName's web page!")
                writer.paragraph("Nice to meet you!")
                writer.mailTo(mailAddr, userName)
                writer.close()
                println("$fileName is created for $mailAddr($userName)")
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }
}
