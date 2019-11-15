package chap02.section4

//ushr 이해하기
//ushr을 이용하면 제일 왼쪽 비트에 0를 밀어 넣으면서 오른쪽으로 비트가 이동.
//부호 비트가 1에서 0으로 바뀍 때문에 주의해서 사용해야한다.
fun main(){
    val number1 = 5
    val number2 = -5

    println(number1 shr 1) // number1을 표현하는 비트를 1만큼 오른쪽으로 이동 (부호있음)
    println(number1 ushr 1)  // number1을 표현하는 비트를 1만큼 오른쪽으로 이동 (부호없음) // 변화 없음
    println(number2 shr 1) // 부호비트가 1로 유지
    println(number2 ushr 1) // 부호비트가 0이 되면서 변경
}