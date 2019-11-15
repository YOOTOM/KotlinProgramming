package chap08.section2

//필요한 정보만 골라내어 변경하기
//연속해서 호출하는 방법을 메서드 체이닝(Method Chaining)이라고 한다.
//각 결과를 it으로 넘겨 받아 처리할 수 있어 매우 유용하다.

fun main() {
    val fruits = arrayOf("banana", "avoado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}