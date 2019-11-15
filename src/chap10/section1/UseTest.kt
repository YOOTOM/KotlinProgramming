package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

//use()함수 사용해 보기
//use()함수를 사용하면 객체를 사용한 후 close()함수를 자동적으로 호추해 닫아 줄 수 있다.
fun main() {
    /*PrintWriter(FileOutputStream("path")).use {
        it.println("hello")
    }*/

    val file = File("/Users/YOOMAC/Downloads/test/contents.txt")
    file.bufferedReader().use {
        println(it.readText())
    }
}