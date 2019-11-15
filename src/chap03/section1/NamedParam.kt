package chap03.section1

//매개변수 이름과 함께 함수 호출하기
//매개변수가 너무 많은 함수를 호출하다 보면 가끔 어떤 인자를 어떤 매개변수에 전달 헀는지 헷갈리는 경우가 있다.
//그래서 코틀린은 매개변수의 이름과 함께 인자를 전달하는 방법을 제공.
fun main() {
    namedParam(x = 200, z = 100) // x,z의 이름과 함께 함수 호출(y는 기본값 사용)
    namedParam(z = 150) // z의 이름과 함께 함수 호출(x와y는 기본 값을 지정됨)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}
