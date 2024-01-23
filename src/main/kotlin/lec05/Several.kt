package lec05

import lec05.a.printHelloWorld as printHelloWorldA
import lec05.b.printHelloWorld as printHelloWorldB

/**
 * Type Alias
 */
data class UltraSuperGuardianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>


fun main() {
    /**
     * as import
     */
    printHelloWorldA()
    printHelloWorldB()

    val numbers = listOf(1, 2, 3)

    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
        }
    }

    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
    }

    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    /**
     * 라벨을 사용한 Jump는 사용하지 않음을 권장
     */
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            break@abc
        }
    }
}

