package io.github.t45k.designPatternLearning.iterator

class LinkedListIterator<T>(first: LinkedList.Adapter<T>?) : Iterator<T> {
    private var current = first

    override fun hasNext(): Boolean = current != null

    override fun next(): T {
        if (!hasNext()) {
            throw NoSuchElementException()
        }

        val tmp = current!!
        current = current!!.next
        return tmp.value
    }
}