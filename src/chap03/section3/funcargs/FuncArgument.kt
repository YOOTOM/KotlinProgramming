package chap03.section3.funcargs

//인자에 일반 함수 사용해 보기
fun main() {
    val res1 = customSum(3, 2) //일반 인자
    val res2 = customMul(customSum(3, 3), 3) //인자에 함수를 사용

    println("res1 : $res1, res2: $res2")
}

fun customSum(a: Int, b: Int) = a + b
//고차함수, 일반함수를 인자나 반환값으로 사용하는 함수
fun customMul(a: Int, b: Int) = a * b
