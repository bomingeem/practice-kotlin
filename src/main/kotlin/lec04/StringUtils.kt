package lec04

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

/**
 * fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
 *  this (수신객체)를 이용해 실제 클래스 안의 값에 접근
 * }
 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}
