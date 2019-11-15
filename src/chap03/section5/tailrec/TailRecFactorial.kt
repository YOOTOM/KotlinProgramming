package chap03.section5.tailrec

//꼬리 재귀를 사용해 팩토리얼 만들어 보기
//일반적인 재귀에서는 재귀 함수가 먼저 호출되고 계산되지만 꼬리 재귀에서는 계산을 먼저하고 재귀함수가 호출 된다.
//꼬리 재귀를 사용하면 팩토리얼의 값을 그때그때 계산하므로 스택 메로리를 낭비하지 않아도 된다.
fun main() {

    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
}
//꼬리 재귀 함수
tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}