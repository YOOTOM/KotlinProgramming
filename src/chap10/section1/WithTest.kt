package chap10.section1

//with() 함수 사용해 보기
fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    var user = User("msyoo", "default")

    //null이 아닌 경우가 확실하다면 with()함수만 사용해도 된다.
    val result = with(user) {
        skills = "Kotlin"
        email = "kildong@example.com"
        //기본적으로 Unit이 반환되지만, 필요한 경우 마지막 표현식을 반환할 수 있다.
        //이 경우에 result는 "success"를 할단 하는 String형 변수가 된다.
        "success" //마지막 표현식 반환
    }
    println(user)
    println("result: $result")

}