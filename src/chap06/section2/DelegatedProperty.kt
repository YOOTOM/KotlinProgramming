package chap06.section2

import kotlin.properties.Delegates

//observable() 함수 간단히 사용해 보기
class User {
    //initialValue는 "NONAME"
    var name: String by Delegates.observable("NONAME") { // 프로퍼티 위임
        //값의 변경이 일어나는 시점에 블록이 실행됨
            prop, old, new ->
        //람다식 매개변수로 프로퍼티, 기존 값, 새로운 값 지정
        println("$old -> $new")

    }
}
//observable() - 감시역할
fun main() {
    val user = User()
    user.name = "msyoo" //값이 변경되는 시점에서 첫 이벤트 발생
    user.name = "Dooly" //값이 변경되는 시점에서 두 번째 이벤트 발생
}