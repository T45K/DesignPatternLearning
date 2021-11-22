package io.github.t45k.designPatternLearning.iterator

fun main() {
    val bookShelf = BookShelf(4).apply {
        appendBook(Book("Around the world in80 days"))
        appendBook(Book("Bible"))
        appendBook(Book("Cinderella"))
        appendBook(Book("Daddy-Long-Legs"))
    }

    val it = bookShelf.iterator()
    while (it.hasNext()) {
        val book = it.next()
        println(book.name)
    }
    println()

    // for文でも使える
    for (book in bookShelf) {
        println(book.name)
    }
    println()

    // kotlinのiteratorはさらに色々できる
    (bookShelf.map { it.name }
        .find { it == "GoF" }
        ?: "404")
        .run(::println)

    // JavaのStreamはCollectionから生えてる（Iterableから生えてない）ので上のようにはできない

    val list = LinkedList<Book>().apply {
        add(Book("hoge"))
        add(Book("fuga"))
        removeFirst()
        addFirst(Book("piyo"))
        addLast(Book("foo"))
        addFirst(Book("bar"))
        removeLast()
        add(Book("baz"))
    }
    for (book in list) {
        println(book)
    }
}
