package chap03.section3

//매개변수에 람다식 함수를 이용한 고차 함수
fun main() {
    var result: Int
    result = highOrder({ x, y -> x + y }, 10, 20) //람다식을 매개변수와 인자로 사용한 함수
    println(result)
}
//고차함수
fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}