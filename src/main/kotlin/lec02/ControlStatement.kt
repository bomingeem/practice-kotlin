package lec02

class ControlStatement {
    fun validationScoreIsNotNegative(score: Int) {
        if (score !in 0..100) {
            throw IllegalArgumentException("${score}는 0부터 100입니다")
        }
    }

    /**
     * Kotlin에서는 if-else를 Expression으로 취급해서 삼항 연산자가 없다
     * Statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다
     * Expression: 하나의 값으로 도출되는 문장
     */
    fun getPassOrFail(score: Int): String {
        return if (score >= 50) {
            "P"
        } else {
            "F"
        }
    }

    /**
     * 어떠한 값이 특정 범위에 포함되어 있는지, 포함되어 있지 않은지
     * if (0 <= score && score <= 100)
     * if (score in 0..100)
     */
    fun getGrade(score: Int): String {
        return if (score >= 90) {
            "A"
        } else if (score >= 70) {
            "C"
        } else {
            "D"
        }
    }

    /**
     * Java의 switch는 Kotlin에서 when 대체되었다
     */
    fun getGradeWithSwitch(score: Int): String {
        return when (score / 10) {
            9 -> "A"
            8 -> "B"
            7 -> "C"
            else -> "D"
        }
    }

    fun getGradeWithSwitch2(score: Int): String {
        return when (score) {
            in 90..99 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            else -> "D"
        }
    }

    fun startsWithA(obj: Any): Boolean {
        return when (obj) {
            is String -> obj.startsWith("A")
            else -> false
        }
    }

    fun judgeNumber(number: Int) {
        when (number) {
            1, 0, -1 -> println("어디서 많이 본 숫자입니다")
            else -> println("1, 0, -1이 아닙니다")
        }
    }

    fun judgeNumber2(number: Int) {
        when {
            number == 0 -> println("주어진 숫자는 0입니다")
            number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
            else -> println("주어진 숫자는 홀수입니다")
        }
    }
}
