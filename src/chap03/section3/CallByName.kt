package chap03.section3

//람다식 이름을 사용해 호출하기
fun main() {
    val result = callByName(otherLambda) //람다식 이름으로 호출
    println(result)

}

fun callByName(b: () -> Boolean): Boolean { //람다식 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}
// 이것을 잘활용하면 상황에 맞춰 즉시 실행할 필요가 없는 코드를 작성하는 경우 이름에 의한 호출 방법을 통해 필요할 때만 람다식이 작동하도록 만들 수 있다.
// 우선 순위 람다식 자료형 -> 일반 변수 자료형