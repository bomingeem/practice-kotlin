package lec03

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person2 private constructor(
    var name: String,
    var age: Int
){

    /**
     * static: 클래스가 인스턴스화 될 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
     * companion object: 클래스와 동행하는 유일한 오브젝트
     */
    companion object Factory : Log {
        /**
         * 컴파일 시에 변수가 할당된다
         * 진짜 상수에 붙이기 위한 용도, 기본 타입과 String에 붙일 수 있음
         */
        private const val MIN_AGE = 1

        /**
         * Java에서 Kotlin companion object를 사용하려면 @JvmStatic을 붙어야 한다
         * 이름이 있으면 이름을 사용하면 된다
         */
        fun newBaby(name: String): Person2 {
            return Person2(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person2 클래스의 동행객체 Factory")
        }

    }
}

object Singleton {
    var a: Int = 0
}
