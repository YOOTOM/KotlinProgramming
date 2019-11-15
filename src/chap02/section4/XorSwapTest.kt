package chap02.section4

//xor 연산자로 두 값을 스왑하기
//xor 연산를 3번 사용하여 두수를 바꿈
//xor을 이용하는 스왑 기법을 사용하면 임시 변수를 놓고 변수를 저장하여 옮기는 등의 작업을 하지 않아도 간편하게 두수를 바꿀수 있어 편리
fun main() {
    var number1 = 12
    var number2 = 25

    number1 = number1 xor number2
    number2 = number1 xor number2
    number1 = number1 xor number2

    println("number1 = $number1") //25
    println("number2 = $number2") //12
}