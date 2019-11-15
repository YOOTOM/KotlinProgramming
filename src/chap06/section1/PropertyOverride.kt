package chap06.section1

//프로퍼티의 오버라이딩 사용하기
//프로퍼티는 기본으로 오버라이딩할 수 없는 final 형태로 선언된다.
//만일 프로퍼티를 오버라이딩 가느하게 하려면 open 키워드를 사용해 프로퍼티를 선언해야 한다.
open class First {
    open val x : Int = 0 //오버라이딩 가능
        get() {
            println("Frist x")
            return field
        }
    val y: Int = 0 //open 키워드가 없으면 final 프로퍼티
}

class Second : First() {
    override val x : Int = 0 //상위 클래스와 구현부가 다르게 오버라이딩됨
        get() {
            println("Second x")
            return field + 3
        }
    //override val y: Int = 0 //오류! 오버라이딩 불가
}

fun main() {
    val second = Second()
    println(second.x) //오버라이딩된 두 번째 클래 개체의 x
    println(second.y) //상위 클래스로부터 상속받은 값
}
