package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//Job객체의 반환
fun main() {
    val job = GlobalScope.launch {
        //Job객체의 반환
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    println("job.isActivie: ${job.isActive}, completed: ${job.isCompleted}")
    Thread.sleep(2000L)
    println("job.isActivie: ${job.isActive}, completed: ${job.isCompleted}")
}