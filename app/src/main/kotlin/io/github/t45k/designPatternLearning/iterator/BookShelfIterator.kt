package io.github.t45k.designPatternLearning.iterator

/**
 * Concrete Iterator
 * イテレートするために必要な操作の実装を提供する
 */
class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index: Int = 0

    override fun hasNext(): Boolean = index < bookShelf.getLength()

    override fun next(): Book {
        if (!hasNext()) {
            throw NoSuchElementException()
        }

        val book = bookShelf.getBookAt(index)
        index++
        return book
    }
}
