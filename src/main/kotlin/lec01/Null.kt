package lec01

class Null {
    fun main() {
        /**
         * Safe Call (?.)
         * null이 아니면 실행하고, null이면 실행하지 않는다
         */
        val str: String? = "ABC"
        str?.length

        /**
         * Elvis 연산자 (?:)
         * 앞의 연산 결과가 null이면 뒤의 값을 사용
         */
        str?.length ?: 0

        /**
         * 플랫폼 타입
         * Kotlin이 null 관련 정보를 알 수 없는 타입
         * Runtime 시 Exception이 발생할 수 있다
         */
        val person = Person("공부하는 개발자")
        startsWithA(person.name)
    }

    /**
     * Kotlin에서는 null이 들어갈 수 있는 타입은 완전히 다르게 간주된다
     * 한 번 null 검사를 하면 non-null임을 컴파일러가 알 수 있다
     */
    fun startsWithA1(str: String?): Boolean {
        return str?.startsWith("A") ?: throw IllegalAccessException("null이 들어왔습니다")
    }

    fun startsWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
    }

    fun startsWithA3(str: String?): Boolean {
        return str?.startsWith("A") ?: false
    }

    fun startsWithAssert(str: String?): Boolean {
        /**
         * 단언 (!!)
         */
        return str!!.startsWith("A")
    }

    fun startsWithA(str: String): Boolean {
        return str.startsWith("A")
    }
}
