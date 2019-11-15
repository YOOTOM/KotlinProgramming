package chap08.section2

//Any 자료형으로 지정된 배열 채우기
//Any를 사용하면 한 번에 기본적인 초기화를 하고 나중에 원하는 자료형으로 요소를 초기화할 수 있으므로 편리하다.
//Array의 표준 라이브러리 참조
fun main() {
    val b = Array<Any>(10,{0})
    b[0] = "Hello World"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])
}