package util

operator fun Char.times(v: Int): String = this.toString() * v

operator fun String.times(v: Int): String = this.repeat(v)
