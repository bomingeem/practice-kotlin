package lec03

/**
 * 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다
 * 즉, 런타임때 클래스 타입이 추가될 수 없다
 * 추상화가 필요한 Entity or Dto에 sealed Class를 활용
 */
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)
