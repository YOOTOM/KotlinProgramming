package chap02.section1

//기본 패키지 사용하기
/*
fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20

    println("intro: $intro, num : $num")
}
*/

//수학 라이브러리 추가하기
/*
import kotlin.math.PI
import kotlin.math.abs

fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20

    println(PI)
    println(abs(-12.6))

    println("intro: $intro, num : $num")
}*/


//사용자 클래스 (Person) 가져오기
/*
import com.yootom.edu.Person

fun main() {
    val user1 = Person("yootom",30)
    println(user1.name)
    println(user1.age)
}
*/

//사용자 클래스에 별명 붙이기
import com.yootom.edu.Person as User

fun main() {
    val user1 = User("yootom",30) // com.yootom.edu의 Person이 User로 대체
    val user2 = Person("A123", "yootom")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id : String, val name: String)


