package chap03.section5

import java.math.BigInteger


//피보나치 수열을 꼬리 재귀로 만들기
//BigInteger, 무한대 범위의 정수, Long보다 당연히 크며 자바에서 지원하는 API이다.
//꼬리 재귀에서는 기본적으로 스택을 계속 쌓아가며 사용하지 않기 때문에 2만번을 실행해도 문제가 없다.(오버플로우)
fun main() {
    val n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n, first, second))

}

operator fun BigInteger.plus(other: BigInteger): BigInteger {
    return other
}

//꼬리 재귀 함수
tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n - 1, b, a + b)
}
