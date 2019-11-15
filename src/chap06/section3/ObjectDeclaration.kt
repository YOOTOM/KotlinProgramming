package chap06.section3

//object 선언와 컴페니언 객체 비교하기
//object로 선언된 OCustomer는 멤버 프로퍼티와 메서드를 객체 생성 없이 읾의 점(.)표기법으로 바로 사용할 수 있다.
//단일 인스턴스를 생성해 처리하기 때문에 싱글콘 패턴에 이용된다.
//object 선언 방식을 사용하면 접근 시점에 객체가 생성된다.
//object 키워드를 사옹한 방식
object OCustomer {
    var name = "msyoo"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")

    init {
        println("Init!")
    }
}

//컴패니언 객체를 사용한 방식
class CCustomer {
    companion object {
        const val HELLO = "hello" //상수 표현
        var name = "MSYOO"
        @JvmField
        val HOBBY = Hobby("Football")

        @JvmStatic
        fun greeting() = println("Hello World!")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting()//객체의 접근 시점
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}