package chap04.section1

//조건문의 포현식 사용해보기
fun main() {
    val a = 12
    val b = 7

    //블록과 함계 사용
    val max = if (a > b) {
        println("a 선택")
        a // 마지막 식인 a가 반환되어 max에 할당
    } else {
        println("b 선택")
        b // 마지막 식인 b가 반환되어 max에 할당
    }

    println(max)
}

