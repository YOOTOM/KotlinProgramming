package chap06.section1.customgetset

//커스텀 게터와 세터 사용하기
//입력 문자를 대문자로 바꾸는 등의 특정 연산을 수헹해야 한다면 게터와 세터를 확장해 코드를 구성할 수 있어 아주 편리하다.
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase() // 받은 인자를 대문자로 변경해 프로퍼티에 할당
        }

    var age: Int = _age
}

fun main () {
    val user1 = User(1, "msyoo", 35)
    user1.name = "coco" // 여기서 사용자 고유의 출력 코드가 실행
    println("user3.name = ${user1.name}")
}