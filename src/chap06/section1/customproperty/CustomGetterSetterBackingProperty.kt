package chap06.section1.customproperty

//임시적인 보조 프로퍼티 사용하기
//tempName은 이름이 null이 되는 경우를 처리하기 위해 임시적으로 사용하는 프로퍼티
//보조 필드인 field를 사용하지 않고 추가로 냅의 프로퍼티를 임시로 선언해 사용할 수 있다.
//이것인 보조 프로퍼티
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String?= null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    val user1 = User(1, "msyoo", 35)
    user1.name = ""
    println("user3.name = ${user1.name}")
}