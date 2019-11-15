package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//코루틴의 순차적 실행
suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun worksInSerial() {
    //순차적실행
    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One : $one")
        println("Kotlin Two : $two")
    }
}

private fun worksInParallel() {
    //Deferred<T>를 통해 결과값을 반환
    val one = GlobalScope.async {
        doWork1()
    }
    val two = GlobalScope.async {
        doWork2()
    }
    //태스크가 종료되는 시점을 기다렸다가 결과를 받을 수 있도록
    //await()를 사용해 현재 스레드의 블로킹 없이 먼저 종료되면 결과를 가져올 수 있다.
    //여기서 combined라는 변수에 2개의 비동기 루틴이 종료되고 결과가 반환되면
    //문자를 합쳐서 할당한다.

    //await()를 사용하면 UI를 제외한 루틴만 블로킹되므로 UI가 멈추는 경우를 해결할 수 있다.
    GlobalScope.launch {
        val combined = one.await() + "_" + two.await()
        println("Kotlin Combiend : $combined")
    }
}

fun main() {
    worksInParallel()

    //worksInSerial()
    readLine() //main()이 먼저 종료되는 것을 방지하기 위해 콘솔에서 [Enter]키 입력 대기
}