package lec04

/**
 * Collection 을 만들자 마자 Collections.unmodifiableList() 등 붙여준다
 * 불변 컬렉션이라 하더라도 Reference Type 인 Element 의 필드는 바꿀 수 있다
 */
fun main() {
    /**
     * List, Set
     * 우선 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자
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
    val map = mutableMapOf<Int, String>()
    map[1] = "MONDAY"
    map[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for(key in map.keys) {
        println(key)
        println(map[key])
    }

    for((key, value) in map.entries) {
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>) { }
