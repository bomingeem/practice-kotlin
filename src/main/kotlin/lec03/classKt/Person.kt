package lec03.classKt

fun main() {
    val person = Person("김보민")
    println(person.name)
    println(person.age)
    person.age = 10
}

/**
 * 주생성자(primary constructor): 반드시 존재해야 한다
 * 단, 주생성자에 파라미터가 하나도없다면 생략 가능
 */
class Person(
    name: String = "김보민",
    var age: Int = 30
) {
    /**
     * init (초기화) 블록은 생성자가 호출되는 시점에 호출
     * 값을 적절히 만들어주거나, validation 하는 로직
     */
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }

    /**
     * 부생성자(secondary constructor): 있을 수도 있고 없을 수도 있다
     * 최종적으로 주생성자를 this 로 호출해야 한다
     * body 를 가질 수 있다
     */
    constructor(name: String) : this(name, 1) {
        println("부생성자 1")
    }

    constructor() : this("김보민")

    /**
     * name 은 name 에 대한 getter 를 호출 하니까 다시 get 을 부른다
     * backing field: 무한루프를 막기 위한 예약어, 자기 자신을 가리킨다
     */
    val name: String = name
    get() {
        return field.uppercase()
    }

    val uppercaseName: String
    get() = this.name.uppercase()

    /**
     * setter 자체를 지양하기 때문에 custom setter 도 잘 안쓴다
     * var name: String = name
     * set(value) {
     *  field = value.uppercase()
     * }
     */

    /**
     * fun isAdult(): Boolean {
     *  return this.age >= 20
     * }
     * custom getter
     */
    val isAdult: Boolean
        get() = this.age >= 20
}
