package chap02.section4

//비트 논리 연산자 테스트하기
fun main() {
    val number1 = 12
    val number2 = 25
    val result: Int

    result = number1 or number2 // result = number1.or(number2)와 동일
    println(result)
}