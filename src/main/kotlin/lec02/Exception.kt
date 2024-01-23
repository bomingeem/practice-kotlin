package lec02

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class Exception {
    fun parseIntOrThrow(str: String): Int {
        try {
            return str.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다")
        }
    }

    /**
     * try catch 구문 expression
     */
    fun parseIntOrThrowV2(str: String): Int? {
        return try {
            str.toInt()
        } catch (e: NumberFormatException) {
            null
        }
    }

    /**
     * Kotlin 에서 모든 예외는 Unchecked Exception 이다
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}
