package io.github.t45k.designPatternLearning.chainOfResponsibility.support

import io.github.t45k.designPatternLearning.chainOfResponsibility.Trouble

/**
 * Handler
 */
abstract class Support(private val name: String) {
    private var next: Support? = null

    fun setNext(next: Support): Support {
        this.next = next
        return next
    }

    fun support(trouble: Trouble) {
        if (resolve(trouble)) {
            done(trouble)
        } else {
            next?.support(trouble) ?: fail(trouble)
        }
    }

    override fun toString(): String = "[$name]"

    abstract fun resolve(trouble: Trouble): Boolean

    private fun done(trouble: Trouble) {
        println("$trouble is resolved by $this.")
    }

    private fun fail(trouble: Trouble) {
        println("$trouble cannot by resolved")
    }
}
