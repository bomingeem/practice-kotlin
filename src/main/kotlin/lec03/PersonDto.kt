package lec03

fun main() {
    val dto1 = PersonDto("김보민", 30)
    val dto2 = PersonDto("김보민", 40)
    println(dto1)

}

/**
 * data 키워드를 붙여주면 equals, hashCode, toString을 자동으로 만들어준다
 */
data class PersonDto(
    val name: String,
    val age: Int
)
