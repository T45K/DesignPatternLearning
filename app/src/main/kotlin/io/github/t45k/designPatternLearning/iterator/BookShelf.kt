package io.github.t45k.designPatternLearning.iterator

/**
 * 集約する側のクラス
 */
class BookShelf(maxSize: Int) : Iterable<Book> {
    private val books: Array<Book?> = arrayOfNulls(maxSize)
    private var last = 0

    fun getBookAt(index: Int): Book = books[index]!!

    fun appendBook(book: Book) {
        this.books[last] = book
        last++
    }

    fun getLength(): Int = last

    /**
     * thisを渡すのがキモっぽい
     */
    override fun iterator(): Iterator<Book> = BookShelfIterator(this)
}