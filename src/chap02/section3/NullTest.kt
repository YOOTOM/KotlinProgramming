package chap02.section3

//null 처리하기
/*
fun main() {
    var str1 : String = "Hello Kotlin"
    str1 = null // 오류! null 허용하지 않음
    println("str1 : $str1")
}
*/

/*fun main() {
    var str1 : String? = "Hello Kotlin" //변수에 null 할당을 허용하려면 자료형 뒤에 물음표(?)기호를 명시해야 한다.
    str1 = null
    println("str1 : $str1")
}*/

fun main() {
    var str1: String? = "Hello Kotlin" //변수에 null 할당을 허용하려면 자료형 뒤에 물음표(?)기호를 명시해야 한다.
    str1 = null
    println("str1 : $str1")
    //println("str1 : $str1 length: ${str1?.length}") //str1을 세이프 콜로 안전하게 호출 (?.) 세이프 콜
    //println("str1 : $str1 length: ${str1!!.length}") //NPE강제 발생 (!!.) non-null단정기호
    //조건식을 통해 null 상태 검사
    val len = if (str1 != null) str1.length else -1
    print("str1: $str1 length: ${len}")
}
