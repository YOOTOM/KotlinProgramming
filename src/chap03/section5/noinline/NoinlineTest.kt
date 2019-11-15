package chap03.section5.noinline

//noinline으로 람다식의 인라인 막기
//자바로 디컴파일 해야 인라인여부를 확인 할수 있다.

fun main() {
    shortFunc(3) { println("First call: $it") }
}

inline fun shortFunc(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}