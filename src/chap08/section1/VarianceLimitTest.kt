package chap08.section1

//클래스 관계(out)
//Noting -> Int -> Any
//in
//Noting <- Int <- Any
//자료형을 제한하는 제네릭 클래스
open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int): Animal(50)
class Spider(val poison: Boolean): Animal(1)

//형식 매개변수를 Animal로 제한
class Box2<out T: Animal>(val element: T) { //주 생성자에는 val만 허용
    fun getAnimal(): T = element // out은 반환 자료형에만 사용할 수 있음
    /*fun set(new: T) { //오류! T는 in위치에 사용할 수 없
        element = new
    }*/
}

fun main() {
    //일반적인 객체 선언
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1 //클래스의 상위 자료형으로 반환하는 것은 아무런 문제 없음
    a1 = s1 //a1은 Spider의 객체가 됨
    println("a1.size = ${a1.size}")

    val c2: Box2<Cat> = Box2<Cat>(Cat(10)) //공변성 - Cat은 Animal의 하위 자료형
    println("c2.element.size = ${c2.element.size}")

    //val c3: Box2<Cat> = Box2<Animal>(10) //오류! 반대의 경우는 인스턴스화되지 않음
    //val c4: Box2<Any> = Box2<Int>(10_) //오류! 자료형을 제한하여 Animal과 하위 클래스 이외에는 사용할 수 없다.

}