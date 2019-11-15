package chap03.section5

//중위 함수를 이용해 연산자처럼 사용하기
//클래스의 멤버를 호출할 때 사용하는 점(.)을 생략하고 함수 이름뒤에 소괄호를 붙이지 않아 직관적인 일므을 사용할 수 있는 표현법
fun main() {

    //일반 표현법
    //val multi = 3.multiply(10)

    //중위 표현법
    //직관적
    val multi = 3 multiply 10
    println("multi : $multi")
}

//Int를 확장해서 multiply()함수를 하나 더 추가함
infix fun Int.multiply(x: Int): Int { //infix로 선언되므로 중위 함수
    return this * x
}