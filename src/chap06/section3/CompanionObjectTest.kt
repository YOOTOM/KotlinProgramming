package chap06.section3

class Person {
    var id: Int = 0
    var name: String = "msyoo"
    //java의 static와 같은 개념
    //캠패니언 객체는 실재 객체의 싱글톤으로 정의 된다.
    /*싱글톤 패턴은 전역변수를 사용하지 않고 객체를 하나만 생성하도록 하며,
    생성된 객체를 어디에서든지 참조할 수 있도록 하는 디자인 패턴의 하나
    이 패턴을 사용하는 이유는 객체가 서로 동일한 정보를 가질때 하나의 메모리만 유지해
    자원의 낭비를 줄일 수 있기 때문이다.*/
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person.language) //인스터스를 생성하지 않고 기본값 사용
    Person.language = "English" //기본값 변경 가능
    println(Person.language) //변경된 내용출력
    Person.work() //메서드 실행
    //println(Person.name) //name은 컴페니언 객체가 아니므로 오류
}