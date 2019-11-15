package chap04.section3
//inline을 사용한 람다식의 반환
//람다식에서 return은 라벨 표기화 함께 사용해야 하고 break와 continue는 아직 지원되지 않는다.
fun main() {
    retFunc()
}

inline fun inlinelamda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc") //1
    inlinelamda(13, 3) { a, b ->//2
        val result = a + b
        if (result > 10) return //10보다 크면 이 함수를 빠져나감 //3
        println("result :  $result") //10보다 크면 이 문장에 도달하지 못함 //4
    }
    println("end of retFunc") //5
}
