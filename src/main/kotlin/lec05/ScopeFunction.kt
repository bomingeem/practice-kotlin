package lec05

fun main() {
    /**
     * let
     * 하나 이상의 함수를 call chain 결과로 호출할 때
     * non-null 값에 대해서만 code block 을 실행시킬 때
     * 일회성으로 제한된 영역에 지역 변수를 만들 때
     * 람다의 결과, it 사용
     */
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println)

    val str = "AA"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem -> if (firstItem.length >= 5) firstItem else "!$firstItem!" }
        .uppercase()
    println(modifiedFirstItem)

    /**
     * run
     * 객체 초기화와 반환 값의 계산을 동시에 해야할 때
     * 람다의 결과, it 사용
     */
    // Person("김보민", 29).run(personRepository::save)

    /**
     * also
     * 객체를 수정하는 로직이 call chain 중간에 필요할 때
     * 객체 그 자체, this 사용
     */
    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    val numbers2 = mutableListOf("one", "two", "three")
    println("The list elements before adding new one: $numbers2")
    numbers2.add("four")
}

fun printPerson(person: Person?) {
//    if (person != null) {
//        println(person.name)
//        println(person.age)
//    }
    person?.let {
        println(it.name)
        println(it.age)
    }
}
