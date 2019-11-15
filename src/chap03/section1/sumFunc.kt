package chap03.section1

//덧셈 함수 정의하기
/*fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}*/

//덧셈 함수 간략하게 만들기
//fun sum(a: Int, b: Int): Int = a + b

//덧셈 함수 간략하게 만들기2
//대형 프로젝트를 진행할 때는 이렇게 함수를 작성하는 것이 코드의 양도 줄일 수 있고 읽기에도 좋아 실무에서 많이 사용한다.
fun sum(a: Int, b: Int) = a + b

//sum() 함수 선언하고 호출하기
//함수를 선언할 때는 매개변수, 함수를 호출할 때는 인자
fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)

}
