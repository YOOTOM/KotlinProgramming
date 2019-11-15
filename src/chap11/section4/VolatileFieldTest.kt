package chap11.section4

import chap11.section1.thread

//@Volatile 사용하기
//Volatile 키워드를 사용하면 코드가 최적화되면서 순서가 바뀌는 경우를 방지 할수 있다
//쉽게 말해 volatile을 사용하면 항상 프로그래머가 의도한 순서대로 일기 및 쓰기를 수행한다.
/*
일정 시간이 지난후 stop() 함수에 의해 running의 상태를 변경하고 start()함수의 while조건이 false가
되면서 프로그램이 중단됩니다. 하지만 @Volatile은 값 쓰기에 대해서는 보장하지 않는다.
원자성 보장이 필요.
*/
@Volatile
private var running = false
private var count = 0

fun start() {
    running = true
    thread(start = true) {
        while (running) println("${Thread.currentThread()}, count: ${count++}")
    }
}

fun stop() { running = false}

fun main() {
    start()
    start()
    Thread.sleep(10)
    stop() //여기서 상태를 바
}