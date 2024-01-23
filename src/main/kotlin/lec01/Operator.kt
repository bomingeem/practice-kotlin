package lec01

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }

    println(money1 === money2)
    println(money1 == money3)

    val money4 = Money(1_000L)
    val money5 = Money(2_000L)
    println(money4 + money5)
}
