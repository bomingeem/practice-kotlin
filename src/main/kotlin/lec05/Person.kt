package lec05

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    /**
     * 구조분해: 복합적인 값을 분해하여 여러 변수를 한 번에 초기화하는 것
     * componentN
     */
    val person = Person("김보민", 29)
     val (name, age) = person
//    val name = person.component1()
//    val age = person.component2()

    println("이름: ${name}, 나이: ${age}")

}
