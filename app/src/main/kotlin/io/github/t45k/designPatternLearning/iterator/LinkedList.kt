package io.github.t45k.designPatternLearning.iterator

class LinkedList<T> : Iterable<T> {
    private var first: Adapter<T>? = null
    private var last: Adapter<T>? = null

    fun addFirst(value: T) {
        val tmp = first
        first = Adapter(value, next = tmp)
        if (tmp == null) {
            last = first
        } else {
            tmp.previous = first
        }
    }

    fun addLast(value: T) {
        val tmp = last
        last = Adapter(value, previous = tmp)
        if (tmp == null) {
            first = last
        } else {
            tmp.next = last
        }
    }

    fun add(value: T) = addLast(value)

    fun getFirst(): T = first?.value ?: throw NoSuchElementException()

    fun getLast(): T = last?.value ?: throw NoSuchElementException()

    fun removeFirst() {
        if (first == null) {
            throw NoSuchElementException()
        }

        first = first!!.next
        if (first == null) {
            last = null
        }
    }

    fun removeLast() {
        if (last == null) {
            throw NoSuchElementException()
        }

        last = last!!.previous
        if (last == null) {
            first = null
        }
    }

    override fun iterator(): Iterator<T> = LinkedListIterator(this.first)

    data class Adapter<T>(val value: T, var previous: Adapter<T>? = null, var next: Adapter<T>? = null)
}
