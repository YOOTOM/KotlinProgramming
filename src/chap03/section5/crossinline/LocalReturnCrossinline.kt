package chap03.section5.crossinline

//crossinline으로 비지역 반환 금지하기
//crossinline 키워드는 비지역 반환을 금지해야 하는 람다식에 사용
fun main() {
    shortFunc(3) {
        println("First call:$it")
        //return 사용불가
}
}

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()")

}

fun nestedFunc(body: () -> Unit) {
    body()
}