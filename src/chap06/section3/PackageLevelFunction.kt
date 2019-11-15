//만일 접근한 클래스 이름을 바꾸고 싶다면 @file:JvmName("ClassName")을 코드 상단에 입력하면된다.
@file:JvmName("PKLevel")
package chap06.section3

//최상위 함수 사용하기
fun packageLevelFunc() {
    println("Package-Level Function")
}

fun main() {
    packageLevelFunc()
}