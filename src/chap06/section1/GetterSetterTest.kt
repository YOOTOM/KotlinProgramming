package chap06.section1

//게터와 세터 동작 확인하기
//코틀린에서 게터와 세터를 자동적으로 처리해 준 덕분에 코드의 양이 확 줄었다.
//주 생성자에 3개의 매개변수 정의
class User(_id: Int, _name: String, _age: Int) {
    //프로퍼티
    val id: Int = _id //불편(읽기전용)
    var name: String = _name //변경가능
    var age: Int = _age //변경가능
}
//간소화
//class User(val id: Int, var name: String, var age: Int)

fun main(){
    val user  = User(1,"Sean", 30)

    val name = user.name //게터에 의한 값 획득

    user.age = 41 //세터에 의한 값 지정

    println("name: $name, ${user.age}")
}