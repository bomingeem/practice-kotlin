package lec05

fun main() {
    /**
     * let
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
     */
    // Person("김보민", 29).run(personRepository::save)

    /**
     * also
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
