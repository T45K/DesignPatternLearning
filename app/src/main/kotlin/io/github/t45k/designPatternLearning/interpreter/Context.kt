package io.github.t45k.designPatternLearning.interpreter

class Context(text: String) {
    private val tokens = text.split(Regex("\\s+"))
    private var index = 0
    private var lastToken: String? = null

    init {
        nextToken()
    }

    fun nextToken(): String? {
        lastToken = if (index < tokens.size) {
            tokens[index++]
        } else {
            null
        }
        return lastToken
    }

    fun currentToken(): String? = lastToken

    @Throws(ParseException::class)
    fun skipToken(token: String) {
        if (currentToken() == null) {
            throw ParseException("Error: '$token' is expected, but not more token is found.")
        } else if (currentToken() != token) {
            throw ParseException("Error: 'token' is expected, but '${currentToken()}' is found.")
        }
        nextToken()
    }

    @Throws(ParseException::class)
    fun currentNumber(): Int {
        if (currentToken() == null) {
            throw ParseException("Error: No more token:")
        }
        try {
            return currentToken()!!.toInt()
        } catch (e: NumberFormatException) {
            throw ParseException("Error: $e")
        }
    }
}
