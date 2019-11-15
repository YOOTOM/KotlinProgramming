package chap10.section3

import java.io.BufferedReader
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.StringBuilder

//자바 읽기 코드의 단순 변환
fun main() {
    val path = "/Users/YOOMAC/Downloads/test/hello.txt"

    //단순변환
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val inputStreamReader = InputStreamReader(inputStream)
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(inputStreamReader)
    try {
        line = br.readLine()
        while (line != null) {
            sb.append(line, '\n')
            line = br.readLine()
        }
        println(sb)
    } catch (e: Exception) {

    } finally {
        br.close()
    }
}