package chap03.section3.funcfunc

//반환값에 일반 함수 사용해 보기
fun main() {
    println("funcFunc : ${funcFunc()}")
}

fun customSum(a: Int, b: Int) = a + b

//고차함수, 일반함수를 인자나 반환값으로 사용하는 함수
fun funcFunc(): Int { // 함수의 반환값으로 함수 사용
    return customSum(2, 2)
}