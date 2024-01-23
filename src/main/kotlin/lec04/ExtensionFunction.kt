package lec04

fun Person.nextYearAge(): Int {
    print("확장 함수")
    return this.age + 1
}

fun main() {
    /**
     * 확장함수는 원본 클래스의 private, protected 멤버 접근 불가
     * 멤버함수, 확장함수 중 멤버함수에 우선권이 있다
     * 확장함수는 현재 타입을 기준으로 호출된다
     */
    val person = Person("A", "B", 100)
    person.nextYearAge()
}

