package lec03.objectKt

import lec03.inheritanceKt.Movable

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }
        override fun fly() {
            println("날다 날다")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
