package lec04

class Collection {
    fun main() {
        /**
         * List, Set
         */
        val numbers = mutableListOf(100, 200)
        val setNumbers = mutableSetOf(100, 200)
        numbers.add(300)
        val emptyList = emptyList<Int>()
        printNumbers(emptyList())

        println(numbers[0])

        for (number in numbers) {
            println(number)
        }

        for ((index, value) in numbers.withIndex()) {
            println("${index} ${value}")
        }

        /**
         * Map
         */
        val oldMap = mutableMapOf<Int, String>()
        oldMap[1] = "MONDAY"
        oldMap[2] = "TUESDAY"

        mapOf(1 to "MONDAY", 2 to "TUESDAY")

        for(key in oldMap.keys) {
            println(key)
            println(oldMap[key])
        }

        for((key, value) in oldMap.entries) {
            println(key)
            println(value)
        }
    }
}

private fun printNumbers(numbers: List<Int>) { }
