package chap11.section4

import kotlinx.coroutines.*
import sun.awt.Mutex
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

//스레드에 가두기
//단일 스레드 문맥을 선언
val counterContext = newSingleThreadContext("CounterContext")
var counter_ = 0


suspend fun massiveRun(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch(context) {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking<Unit> {
    /*massiveRun {
        withContext(counterContext) { //단일 스레드에 가둠
            counter_++
        }
    }*/
    //스레드에 가두는 방법은 실행 시간이 많이 걸린다.
    //실행을 조금 더 빠르게 하기 위해서는 massiveRun()에 스레드를 가두기를 직접 적용하면 된다.
    /* massiveRun(counterContext) {
         counter_++
     }
     println("Counter = $counter")*/
}
//원자 변수 방법 보다는 약간 느린 결과를 보여 준다.
//스레드는 문맥상 counter를 독립적으로 가지며 처리하기 때문에 공유 변수 counter의 연산의 무결성을 보장할 수 있다.
//다만 공간이 필요하므로 좀 느려진다는 점을 알아야한다.
