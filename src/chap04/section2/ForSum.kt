package chap04.section2

//1부터 10까지 더하기
fun main() {
    var sum = 0

    /*for (x in 1..10) sum += x
    println("sum: $sum")*/

    //for (i in 5..1) print(i) //아무것도 출력되지 않음

    //역순으로 작성하는 방법
    //for(i in 5 downTo 1) print(i)

    //홀수의 계수만 사용하기 위해 숫자 2단계 증가방법
    //for (i in 1..5 step 2) print(i)

    //downTo키워드와step키워드를 혼합
    //역순과 숫자 2단계 감소
    for (i in 5 downTo 1 step 2) print(i)

}
