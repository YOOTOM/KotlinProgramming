package chap08.section1

class Box<T>(t: T) { //형식 매개변수로 받은 인자를 name에 저장
    var name = t
}

fun main() {
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")
    //객체 생성 시 만일 생성자에서 유추될 수 있는 자료형이 있다면 선언된 자료형인 <String>이나 <Int>는 다음과 같이 생략 가능
    val box3 = Box(1) //1은 Int형이므로 Box<Int>로 추론
    val box4 = Box("Hello") //"Hello"는 String형이므로 Box<String>으로 추론
    println(box1.name)
    println(box2.name)
}