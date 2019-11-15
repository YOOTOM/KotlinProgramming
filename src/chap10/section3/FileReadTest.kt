package chap10.section3

import java.io.FileReader
import java.lang.Exception

//FileReader로 파일 읽기
fun main() {
    val path = "/Users/YOOMAC/Downloads/test/hello.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch (e: Exception) {
        println(e.message)
    }
}