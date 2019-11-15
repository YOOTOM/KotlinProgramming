package chap09.section2

//가변형 List 사용하기
//컴파일할 때 반환되는 자료형은 List가 아닌 자바의 ArrayList이다.
fun main() {
    //가변형 List를 생성하고 자바의 ArrayList로 변환
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")
    stringList.add("Java") //추가
    stringList.remove("Hello")//삭제
    println(stringList)
}