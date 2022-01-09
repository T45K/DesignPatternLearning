package io.github.t45k.designPatternLearning.composite

fun main() {
    println("Making root entries...")
    val root = Directory("root")
    val bin = Directory("bin")
    val tmp = Directory("tmp")
    val usr = Directory("usr")

    root.add(bin)
    root.add(tmp)
    root.add(usr)

    bin.add(File("vi", 10000))
    bin.add(File("latex", 20000))

    root.printList()
    println()

    println("Making user entries...")
    val yuki = Directory("yuki")
    val hanako = Directory("hanako")
    val tomura = Directory("tomura")

    usr.add(yuki)
    usr.add(hanako)
    usr.add(tomura)

    yuki.add(File("diary.html", 100))
    yuki.add(File("Composite", 200))

    hanako.add((File("memo.tex", 300)))

    tomura.add(File("game.doc", 400))
    tomura.add(File("junk.mail", 500))

    root.printList()
}
