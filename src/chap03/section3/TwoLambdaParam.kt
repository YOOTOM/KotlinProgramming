package chap03.section3

//2개의 람다식을 매개변수로 가진 함수의 사용
fun main() {
    twoLambda({ a, b -> "First $a $b" }, { "Second $it" })
    //마지막 인자(인자가 람다식일 경우)는 소괄호 밖에 둘 수 있다.
    //람다식 함수가 3개가 되었을 때도 마찬가지 이다.
    twoLambda({ a, b -> "First $a $b" }) { "Second $it" } //위와 동일

}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}