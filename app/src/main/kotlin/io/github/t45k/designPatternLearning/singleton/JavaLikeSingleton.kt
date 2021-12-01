package io.github.t45k.designPatternLearning.singleton


class JavaLikeSingleton private constructor() {
    init {
        println("インスタンスを生成しました（Java）．")
    }

    companion object {
        private val singleton: JavaLikeSingleton = JavaLikeSingleton()
        fun getInstance(): JavaLikeSingleton = singleton
    }
}
