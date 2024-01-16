package lec03

/**
 * 기본적으로 바깥 클래스를 참조하지 않는다
 * 바깥 클래스를 참조하고 싶다면 inner 키워드를 추가한다
 */
class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
        get() = this@House.address
    }
}
