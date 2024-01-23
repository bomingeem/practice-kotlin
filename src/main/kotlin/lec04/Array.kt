package lec04

class Array {
    fun main() {
        val array = arrayOf(100, 200)
        array.plus(300)

        for((index, value) in array.withIndex()) {
            println("$index $value")
        }

    }
}
