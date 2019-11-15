package chap08.section1

//람다식에서 제네릭 사용
fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}
//함수의 람다식 매개변수를 좀 더 읽기 좋게 단순화하기 위해서는 typealias를 사용해 다른 이름을 줄 수 있다.
typealias arithmetic<T> = (T, T) -> T

fun <T> addAux(a: T, b: T, op: arithmetic<T>): T {
    return op(a, b)
}

fun main() {
    val result = add(2, 3, { a, b -> a + b })
    //val result = add(2,3){a,b->a+b}와 같이 표현가능
    var sumInt: (Int, Int) -> Int = { a, b -> a + b } //변수 선언부가 있는 경우 표현식의 자료형 생략
    var sumInt2 = { a: Int, b: Int -> a + b } //변수 선언부가 생략된 경우에는 표현식에 자료형 표기
    println(result)
    println(add(2, 3, sumInt))
    println(add(2, 3, sumInt2))
}