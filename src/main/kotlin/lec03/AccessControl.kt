package lec03

class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
) {
    /**
     * setter에만 추가로 가시성을 부여할 수 있다
     */
    var price = _price
        private set
}
