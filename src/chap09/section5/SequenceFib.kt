package chap09.section5

//시퀀스를 이용한 피보나치 수열 출력하기
//fibonacci는 Sequence객체이며 take(10).toList()를 사용해 필요한 요소의 개수를 10개를 지정하고 List를 반환
//람다식과 map을 사용해 아주 간단하게 해결
fun main(){
    val fibonacci = generateSequence(1 to 1){ it.second to it.first + it.second }
        .map { it.first }
    println(fibonacci.take(10).toList())
}