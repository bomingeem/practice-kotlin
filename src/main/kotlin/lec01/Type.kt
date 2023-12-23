package lec01

class Type {
    fun main() {
        val number1: Int = 4
        val number2: Long = number1.toLong()
        println(number1 + number2)

        /**
         * 변수가 nullable이라면 적절한 처리가 필요하다
         */
        val number3: Int? = 3
        val number4: Long = number3?.toLong() ?: 0L

        printAgeIfPerson(Person("", 100))

        /**
         * 문자열 가공 시 ${변수}와 """ """를 사용하면 깔끔한 코딩이 가능하다
         * ${변수}를 사용하는 것이 가독성, 일괄 변환, 정규식 활용 측면에서 좋다
         */
        val person = Person("김보민", 29)
        val name = "김보민"

        println("이름 : ${person.name}, $name")

        val str = """
            ABC
            EFG
            ${name}
        """.trimIndent()
        println(str)

        /**
         * 문자열에서 문자를 가져올때 Java의 배열처럼 []를 사용한다
         */
        println(str[0])
        println(str[2])
    }

    /**
     * Any:
     *  Java의 Object 역할 (모든 객체의 최상위 타입)
     *  모든 Primitive Type의 최상의 타입도 Any이다
     *  Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현
     *  Any에 equals / hashCode / toString 존재
     *
     * Unit:
     *  Java의 void 역할
     *  void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능하다
     *  함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미. 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
     *
     * Nothing:
     *  함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
     *  무조건 예외를 반환하는 함수, 무한 루프 함수 등
     */
    fun printAgeIfPerson(obj: Any?) {
        if (obj is Person) {
            /**
             * val person = obj as Person
             * println(person.age)
             * 스마트 캐스트
             */
            println(obj.age)
        }

        val person = obj as? Person
        println(person?.age)
    }
}
