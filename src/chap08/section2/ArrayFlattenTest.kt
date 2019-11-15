package chap08.section2

//2차원 배열을 평탄화 하기
fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strs) //2차원 배열
    simpleArray.forEach { println(it) } //객체의 시그니처 출력

    val flattenSimpleArray = simpleArray.flatten() //단일 배열로 변환하기
    println(flattenSimpleArray) //정상적으로 출력
}