package chap08.section1

//reified를 이용한 결정되지 않은 제네릭 자료형의 처리
//reified, 구체화하다.
//매개변수 T를 지정하면 실행 시간에 접근할 수 있다.
//컴파일러가 복사해 넣을 때 실제 자료형을 알 수 있기 때문에 실행 시간에도 사용할 수 있다.
fun main() {
    val result = getType<Float>(10)
    println("result = $result")
}

//inline 메모리에 미리 복사를하여 메모리 성능 향상해준다.
//중복으로 사용할때 유용하다.
inline fun <reified T> getType(value: Int): T {
    //.class형태로 번환
    //검사하기(메타데이터를)
    //문서 참조
    println(T::class) //실행 시간에 삭제되지 않고 사용가능 //KClass
    println(T::class.java) //Class//자바와 동일한 Class를 가지려면

    return when (T::class) { //받아들인 제네릭 자료형에 따라 반환
        Float::class -> value.toFloat() as T
        Int::class -> value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }
}