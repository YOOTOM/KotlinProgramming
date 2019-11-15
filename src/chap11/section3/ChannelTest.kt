package chap11.section3

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//send()와 receive() 함수로 채널을 사용해 보기

fun main() = runBlocking<Unit> {
    val channel = Channel<Int>()
    launch {
        //여기에 다량의 CPU연산 작업이나 비동기 로직을 둘 수 있음
        for (x in 1..5) channel.send(x * x)
    }
    //repeat()함수를 사용한 반복 동작하기
    //지속적으로 반복하는 코드를 작성하기 위해 repeat()함수를 이용할 수 있다.
    //백그라운드에서 실행하는 일본의 데몬(daemon)스레디를 구성할 수 있다.
    repeat(5) { println(channel.receive()) } //5개의 값을 채널로부터 받음
    println("Done!")
}