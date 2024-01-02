package lec02

class Loop {
    fun main() {
        /**
         * for each 문에서 Java는 : Kotlin은 in을 사용한다
         */
        val numbers = listOf(1L, 2L, 3L)
        for (number in numbers) {
            println(number)
        }

        /**
         * Kotlin에서 전통적인 for문은 등차수열과 in을 사용한다
         */
        for(i in 1..3) {
            println(i)
        }

        for(i in 3 downTo 1) {
            println(i)
        }

        for(i in 1..5 step 2) {
            println(i)
        }

        var i = 1
        while (i <= 3) {
            println(i)
            i++
        }
    }
}
