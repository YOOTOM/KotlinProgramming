package chap03.section1

//함수의 매개변수에 기본값 지정하기
fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs()
    defaultArgs(200) //100+200
    defaultArgs(400, 300)//400+300

}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메을은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)
}