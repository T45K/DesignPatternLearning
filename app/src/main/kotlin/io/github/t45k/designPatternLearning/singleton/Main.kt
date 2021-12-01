package io.github.t45k.designPatternLearning.singleton

fun main() {
    val obj1 = JavaLikeSingleton.getInstance() // インスタンス生成はこのタイミング
    val obj2 = JavaLikeSingleton.getInstance()
    if (obj1 === obj2) {
        println("obj1とobj2は同じインスタンスです．")
    } else {
        println("obj1とobj2は同じインスタンスではありません．")
    }

    val obj3 = KotlinLikeSingleton // KotlinのObject生成は遅延化される
    val obj4 = KotlinLikeSingleton // KotlinLikeSingletonはオブジェクト
    if (obj3 === obj4) {
        println("obj3とobj4は同じインスタンスです．")
    } else {
        println("obj3とobj4は同じインスタンスではありません．")
    }

    JavaEnumSingleton.INSTANCE.hello()
}
