package chap11.section3

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

//생산자 소비자 형태의 구성
//생산자를 위한 함수 생성
fun CoroutineScope.producer(): ReceiveChannel<Int> = produce {
    var total: Int = 0
    for (x in 1..5) {
        total += x
        send(total)
    }
}

//produce<E>는 값을 생산하고 ReceiveChannel<E>를 반환한다.
//result에서 ReceiveChannel의 확장 함수인 consumeEach를 사용하여 각 요소를 처리한다.
fun main() = runBlocking {
    val result = producer() //값의 생산
    result.consumeEach { print("$it") } //소비자 루틴 구성
}