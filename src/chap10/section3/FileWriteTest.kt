package chap10.section3

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

//Files의 write() 메서드를 사용해 파일 생성하기

fun main() {
    val path = "/Users/YOOMAC/Downloads/test/hello.txt" //파일을 생성할 경로를 지정
    val text = "안녕하세요! Hello World!\n"

    try {
       /* StandardOpenOption의 주요 옵션
            READ : 파일을 읽기용으로 연다
            WRITE : 파일을 쓰기용으로 연다
            APPEND : 파일이 존재하면 마지막에 추가한다.
            CREATE : 파일이 없으면 새 파일을 생성한다.
        */
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch (e: IOException) {
        e.printStackTrace()
    }
}