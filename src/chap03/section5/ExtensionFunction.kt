package chap03.section5

//String 클래스에 확장 함수 추가하기
fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

//String 클래스에 getLongString() 함수를 새로운 멤버 메서드로 추가
//이 함수는 source와 target으로 지정된 문자열 객체를 비교해 더 긴 문자열을 가진 객체를 가져와 반환
//this 는 확장 대상에 있던 자리의 문자열인 source객체를 나타냄
//기존의 표준 라이브러리를 수정하지 않고도 확장 할 수 있는 대단히 유용한 기법
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target