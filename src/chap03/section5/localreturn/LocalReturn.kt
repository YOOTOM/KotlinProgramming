package chap03.section5.localreturn

//return으로 람다식 빠져나오기
//비지역반환
//shortFunc()가 inlie키워드로 선언되지 않으면 return문은 람다식 본문에 사용할 수없다.
fun main() {
    shortFunc(3) {
        print("First call :$it")
        return//1
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")//2
}