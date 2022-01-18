package io.github.t45k.designPatternLearning.facade

import java.io.FileReader
import java.util.Properties

class Database private constructor() {
    companion object {
        fun getProperties(dbName: String): Properties {
            val fileName = "$dbName.txt"
            val properties = Properties()
            properties.load(FileReader(fileName))
            return properties
        }
    }
}
