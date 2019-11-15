package chap11.section2

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

//시작 시점 늦춰 보기
suspend fun doWork_1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork_2(): String {
    delay(3000)
    return "Work2"
}

//CoroutineStart.LAZY를 사용하면 코루틴의 함수를 호출하거나 await()함수를 호출하는 시점에서 async()함수가 실행되도록 코드를 작성할 수 있다.
fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doWork_1() }
        val two = async(start = CoroutineStart.LAZY) { doWork_2() }
        println("AWAIT: ${one.await() + "_" + two.await()}")
    }
    println("Completed in $time ms")
}


