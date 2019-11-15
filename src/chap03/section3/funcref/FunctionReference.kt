package chap03.section3.funcref

//참조에 의한 호출 방식으로 일반 함수 호출 하기
fun main() {

    //1. 인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum) //::sum 함수 참조 기호
    println(res1)

    //2.인자가 없는 함수
    hello(::text) //함수 참조기호
    //hello({ a, b -> text(a, b) }) // 람다식 표현(동일한 결과)
    //hello { a, b -> text(a, b) } // 소괄호 생략(동일한 결과)

    //3.일반 변수에 값처럼 할당
    val likeLambda = ::sum
    println(likeLambda(6, 6))

}

fun sum(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a, $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}