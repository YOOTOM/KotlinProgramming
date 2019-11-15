package chap08.section1

//형식 매개변수에 null이 가능한 제네릭 클래스
//형식 매개변수는 null이 아닌 Any로 제한하여 GenericNull<int?>와 같이 null을 지정할 수 없게 만듬.
// GenericNull<T: Any> //자료형 Any가 지정되어 null을 허용하지 않음
//val obj2 = GenericNull<Int?> () //오류! null이 허용되지 않음
class GenericNull<T> { //기본적으로 null이 허용되는 형식 매개변수
    fun EqualityFunc(arg1: T, arg2: T) {
        //null인 경우 equal()로 비교하지 않고 null을 반환
        println(arg1?.equals(arg2))

    }
}

fun main() {
    val obj = GenericNull<String>() //non-null로 선언됨
    obj.EqualityFunc("Hello", "World") //null이 허용되지 않음

    val obj2 = GenericNull<Int?> () //null이 가능하 형식으로 선언됨
    obj2.EqualityFunc(null,10) //null사용

}