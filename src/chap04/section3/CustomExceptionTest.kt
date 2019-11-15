package chap04.section3

import java.lang.Exception

//사용자 예외 클래스 만들어보기
class InvalidNameException(message: String) : Exception(message) //사용자 예외 클래스

fun main() {
    var name = "yootom123" //숫자가 포함된 이름
    try {
        validateName(name)
    } catch (e: InvalidNameException) { // 숫자가 포함된 예외 처리
        println(e.message)
    } catch (e: Exception) { //기타 예외 처리
        println(e.message)
    }
}

fun validateName(name: String) {
    //Regex :정규 표현식 , 정규식을 알아두면좋으므로 알아두기!!!
    //Invalid : 인식불가능한
    if (name.matches(Regex(".*\\d+.*"))) { //이름에 숫자가 포함되어 있으면 예외 발생 시
        throw InvalidNameException("Your name : $name : contains numerals.")
    }
}