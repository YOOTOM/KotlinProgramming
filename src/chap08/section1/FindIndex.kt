package chap08.section1

fun <T> find(a: Array<T>, Target: T): Int {
    for (i in a.indices) {
        if (a[i] == Target) return i
    }
    return -1
}
fun main() {
    //Array<T>는 배열을 위한 클래스로 arrayoOf()함수를 이용해 여러 개의 요소를 정의할 수 있다.
    //이 배열의 맴버로 indices는 배열의 유효 범위를 반환합니다.
    //여기서는 St
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Durian")
    val arr2: Array<Int> = arrayOf(1,2,3,4)

    println("arr.indices ${arr1.indices}") //indices는 배열의 유효 범위 반환
    println(find<String>(arr1, "Cherry"))//요소 C의 인덱스 찾아내기
    println(find(arr2,2)) //요소2의 인덱스 찾아내
}
