package lec04

/**
 * Java 에서 함수는 변수에 할당되거나 파라미터로 전달할 수 없다 (2급 시민)
 * Kotlin 에서는 함수가 그 자체로 값이 될 수 있다 (변수에 할당할수도, 파라미터로 넘길 수도)
 * Kotlin 에서는 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다
 * 이렇게 해야만, 람다를 진정한 일급 시민으로 간주하는데 이 데이터 구조를 Closure 라고 부른다
 */
fun main() {
    val fruits =listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0])
    isApple2.invoke(fruits[0])

    filterFruits(fruits, isApple)
    filterFruits(fruits) { it.name == "사과" }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}
