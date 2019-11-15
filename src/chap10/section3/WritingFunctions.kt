package chap10.section3

import java.io.File
import java.io.PrintWriter

//PrintWriter로 파일에 쓰기
fun main() {
    //일반
    val outString: String = "안녕하세요!\tHello\r\nWorld!." //문자열의 구성
    val path = "/Users/YOOMAC/Downloads/test/testfile.txt"

    /*val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString) //파일에 출력
    printWriter.close()*/

    //코틀린 use()
    //File(path).printWriter().use { out -> out.println(outString) }

    //인자가 1개이므로 더 줄이기
    File(path).printWriter().use { it.println(outString) }



}

