package chap06.section1

//기본 게터와 세터 직접 지정하기
class User2(_id: Int, _name: String, _age: Int) {

    /**
     * @param value 세터의 매개변수로 외부로부터 값을 가져옴
     * @param field 프로퍼티를 참조하느 변수
     */
    
    val id: Int = _id
        get() = field
    var nmae: String = _name
        get() = field
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user1 = User2(1,"msyoo", 30)
    //user1.id = 2 //val 프로퍼티는 값 변경 불가
    user1.age  = 35 //세터
    println("user1.age = ${user1.age}") //게터
}