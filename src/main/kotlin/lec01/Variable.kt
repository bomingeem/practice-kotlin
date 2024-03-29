package lec01

fun main() {
    /**
     * 모든 변수는 var / val 을 불여 주어야 한다
     * var: 변경 가능, val: 변경 불가능(read-only)
     * 타입을 명시적으로 작성하지 않아도, 타입이 추론된다
     * val 컬렉션에는 element 를 추가할 수 있다
     * 모든 변수는 우선 val 로 만들고 꼭 필요한 경우 var 로 변경한다
     * Primitive Type 과 Reference Type 을 구분하지 않아도 된다
     * 프로그래머가 boxing / unboxing 을 고려하지 않아도 되도록 Kotlin 이 알아서 처리 해준다
     */
    var number1: Long
    val number2 = 10L

    /**
     * null 이 변수에 들어갈 수 있다면 "타입?" 을 사용해야 한다
     */
    var number3: Long? = 1_000L
    number3 = null

    /**
     * 객체를 인스턴스화 할 때 new 를 붙이지 않아야 한다
     */
    var person = Person("김보민", 29)
}
