package chap11.section4

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

//원자 변수 사용 전 문제점
//var counter = 0 //병행 처리 중 문제가 발생할 수 있는 변수
var counter = AtomicInteger(0) //원자 변수로 초기화

suspend fun massiveRun(action: suspend () -> Unit) {
    val n = 1000 //실행할 코루틴의 수
    val k = 1000 //각 코루틴을 반복할 수
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) { action() }

                println("k = $k")

            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} action in $time ms")
}

fun main() = runBlocking<Unit> {
    massiveRun {
        //counter++ //증가 연산에서 값에서 무결성에 문제가 발생할 수 있음
        counter.incrementAndGet() //원자 변수의 멤버 메서드를 사용해 증가
    }
    //println("Counter = $counter")
    println("Counter = ${counter.get()}")//값 읽

}
//counter 변수는 원자 변수의 정수형으로 선언되었다.
//그래서 증가할 때나 값을 가져올때나 incrementAndGet() 이나 get()과 같은 전용 메서드를 사용해야한다.
//전용 메서드는 코드를 단인 기계어 명령으로 변환하므로 값의 무결성을 보장하고 예상할 수 있는 값으로 실행된다.
