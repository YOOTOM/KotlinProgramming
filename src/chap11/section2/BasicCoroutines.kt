package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//Hello World! 코루틴!
//메인 스레드
fun main() { //메인 스레드의 문맥
    //코루틴 코드(메인스레드와 별도로 실행되므로 넌블로킹 코드)
    //delay()는 suspend함수
    //suspend함수를 코루틴 블록 외에 사용하면 오류가 난다.
    GlobalScope.launch { //새로운 코루틴을 백그라운드에 실행
        delay(1000L) //1초의 넌블로킹 지연(시간의 기본 단위는 ms)
        println("World!") //지연 후 출력
    }
    println("Hello,")//메인 스레드의 코루틴이 지연되는 동안 계속 실행
    Thread.sleep(2000L) //메인 스레드가 JVM에서 바로 종료되지 않게 2초 기다림

}