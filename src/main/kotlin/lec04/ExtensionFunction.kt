package lec04

fun Person.nextYearAge(): Int {
    print("확장 함수")
    return this.age + 1
}

fun main() {
    val person = Person("A", "B", 100)
    person.nextYearAge()
}

