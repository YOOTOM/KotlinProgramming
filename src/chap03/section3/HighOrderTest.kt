package chap03.section3

//변수에 할당하는 람다식 함수 작성하기
fun main() {
    var result: Int
    //고차함수, 변수를 함수 처럼 쓸수 있다.
    val multi = { x: Int, y: Int -> x * y } // 일반 변수에 람다식 할당
    result = multi(10, 20) //람다식이 할당된 변수는 함수처럼 사용 가능
    println(result)
}