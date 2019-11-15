package chap04.section2

//짝수의 합과 홀수의 합 구하기
//짝수와 홀수의 합은 시작 값을 1과 0으로 다르게 하고 step을 활용해 2씩 건너뛰면서 반복
fun main() {
    var total: Int = 0
    //홀수의 합
    for (num in 1..100 step 2) total += num
    println("Odd total: $total")
    //짝수의 합
    for (num in 0..99 step 2) total += num
    println("Even total: $total")
}