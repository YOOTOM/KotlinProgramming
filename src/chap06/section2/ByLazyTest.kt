package chap06.section2

//by lazy로 선언된 프로퍼티 지연 초기화하기
class LazyTest {
    init {
        println("init block")
    }

    val subject by lazy {
        println("lazy initialized")
        "Kotlin Programming" // lazy 반환값
    }

    fun flow() {
        println("not initialized")
        println("subject one : $subject") //최초 초기화 시점 //반환 값이 출력이 된다. -1
        println("subject two : $subject") //이미 초기화된 값 사용 //반환 값이 출력이 된다. -2
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}