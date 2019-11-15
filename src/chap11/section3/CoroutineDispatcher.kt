package chap11.section3

import kotlinx.coroutines.*

//실행 문맥 지정하기
//어떤 문맥에서 코루틴을 실행할지는 디스패처(Dispatcher)가 결정한다.
//Job은 백그라운드에서 실행되는 작업을 가르킴
//개념적으로는 간단한 생명주기를 가지고 있고 부모-자식 관계가 형성되면 부모가 작업이 취소될 때 하위 자식의 작업이 모두 취속된다.
//보통 job()팩토리 함수나 launch에 의해 job객체가 생성된다.
fun main() = runBlocking<Unit> {
    val jobs = arrayListOf<Job>()
    jobs += launch(Dispatchers.Unconfined) {//메인 스레드에서 작업
        println("Unconfined:\t\t ${Thread.currentThread().name}")
    }

    jobs+= launch(coroutineContext) { //부모의 문맥, 여기서는 runBlocking의 문맥
        println("coroutineContext:\t ${Thread.currentThread().name}")
    }

    jobs += launch(Dispatchers.Default) {//디스패처의 기본값
        println("Default:\t\t ${Thread.currentThread().name}")
    }

    jobs += launch(Dispatchers.IO) { //입출력 중심의 문맥
        println("IO:\t\t ${Thread.currentThread().name}")
    }

    jobs += launch { //아무런 인자가 없을 때
        println("main runBlocking: ${Thread.currentThread().name}")
    }

    jobs += launch(newSingleThreadContext("MyThread")) { //새 스레드를 생성
        println("MyThread:\t\t ${Thread.currentThread().name}")
    }

    jobs.forEach { it.join() }
}