package chap03.section5

//일반적인 팩토리얼의 재귀 함수 만들기
//이 과정은 factorial()함수의 문맥을 유지하기 위해 factorial() 함수 스택 메모리의 4배 만큼 스택 메모리를 사용하게 된다.
//따라서 너무 많은 분기를 할 경우 스택이 넘치는 위험성이 있기 때문에 꼬리 재귀 함수를 도입해야한다.
fun main() {
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial: $number -> $result")
}

//재귀 함수
fun factorial(n: Int): Long {
    //재귀 호출
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}
/*
    값이 계산되는 과정
    factorial(4)
    4 * (3 * factorial(3)
    4 * (3 * factorial(2))
    4 * (3 * (2 * factorial(1))
    4 * (3 * (2 * 1))
    24
 */