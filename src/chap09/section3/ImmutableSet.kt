package chap09.section3

//불변형 Set의 초기화
//setOf()에서는 자료형을 혼합하거나 특정 자료형을 지정할 수 있다.
//중복 요소를 허용하지 않으므로 intSet에서는 중복된 요소인 5가 결과에서 하나만 나타난다.
fun main() {
    val mixedTypeSet = setOf("Hello", 5, "world", 3.14, 'c') //자료형 혼합 초기화
    var intSet: Set<Int> = setOf<Int>(1, 5, 5) //정수형만 초기화

    println(mixedTypeSet)
    println(intSet)
}