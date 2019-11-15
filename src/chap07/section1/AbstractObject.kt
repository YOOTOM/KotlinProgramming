package chap07.section1

//추상 클래스의 객체 인스턴스
//추상 클래스로부터 하위 클래스를 생성하지 않고 단일 인스턴스로 객체를 생성하려면 object를 사용해서 지정할 수 있다
//추상 클래스의 선언
abstract class Printer {
    abstract fun print() //추상 메서드
}

val myPrinter = object : Printer() {
    override fun print() {
        print("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}
