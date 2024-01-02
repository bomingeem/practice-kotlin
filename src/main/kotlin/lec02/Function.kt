package lec02

class Function {
    /**
     * =을 사용하는 경우 반환 타입 생략 가능
     * block {} 을 사용하는 경우에는 명시적으로 작성해주어야 함
     * 함수는 클래스 안에 있을 수도, 파일 최상단에 있을수도, 한 파일 안에 여러 함수가 있을 수도 있다
     */
    fun max(a: Int, b: Int) = if (a > b) a else b

    /**
     * default parameter: 밖에서 파라미터를 넣어주지 않으면 기본값을 사용
     * 함수를 호출할때 특정 파라미터를 지정해 넣어줄 수 있다
     */
    fun repeat(
        str: String,
        num: Int = 3,
        useNewLine: Boolean = true
    ) {
        for (i in 1..num) {
            if (useNewLine) {
                println(str)
            } else {
                print(str)
            }
        }
    }

    fun printNameAndGender(name: String, gender: String) {
        println(name)
        println(gender)
    }

    /**
     * 가변인자 vararg, 가변인자 함수를 배열과 호출 시 * 를 붙여주어야 함
     */
    fun printAll(vararg strings: String) {
        /**
         * printAll("A", "B", "C")
         * val array = arrayOf("A", "B", "C")
         * printAll(*array)
         */
        for (str in strings) {
            println(str)
        }
    }
}
