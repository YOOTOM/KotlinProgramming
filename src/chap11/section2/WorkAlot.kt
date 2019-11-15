package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//많은 양의 작업 생성하기
suspend fun doWork_3(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork_4(): String {
    delay(3000)
    return "Work2"
}

//이런 코드를 스레드로 바꾸면 Out-of-memory 오류가 발생한다.
//하지만 코루틴으로 작업하면 내부적으로 단 몇 개의 스레드로 수많은 코루틴을 생성해 실행할 수 이기 때문에
//오류가 발생하지 않는다.
//메모리나 실행 속도 면에서 큰 장점을 가진다.

fun main() = runBlocking {
    /* val jobs = List(100_000) {
         launch {
             delay(1000L)
             print(".")
         }
     }
     jobs.forEach { it.join() } //모든 jobs가 완료될 때까지 기다림*/

    //다른 방법으로 repeat()함수를 사용하면 손쉽게 많은 양의 코루틴을 생성할 수 있다.
    repeat(100_000) {
        launch {
            delay(1000L)
            print("#")
        }
    }
}