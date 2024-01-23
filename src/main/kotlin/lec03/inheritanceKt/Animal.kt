package lec03.inheritanceKt

/**
 * 추상 프로퍼티가 아니라면, 상속받을때 open 을 꼭 붙여야 한다
 */
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}
