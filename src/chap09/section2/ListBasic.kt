package chap09.section2

//불변형 List 사용하기
fun main() {
    //불변형 List 사용
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")

    for (name in names) {
        println(name)
    }

    for (num in numbers) print(num) //한 줄에서 처리하기
    println() //내용이 없을 때는 한줄 내리는 개행

    //서로 다른 자료형을 가진 요소를 합쳐서 선언
    var mixedTypes = listOf("Hello", 1, 2.445, 's')
}