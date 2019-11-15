package chap11.section3

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import java.util.*

//select 표현식 이용해 보기
//다양한 채널에서 무언가 응답해야 한다면 각 채널의 실행 시간에 따라 결과가 달라질 수 있는데
//이때 select를 사용하면 표현식을 통해 결과를 받을 수 있다.

/*
블로킹은 자신의 수행결과가 끝날 때까지 제어권을 갖고 있는 것을 의미
논블로킹은 자신이 호출되었을 때 제어권을 바로 자신을 호출한 쪽으로 넘기며, 자신을 호출한 쪽에서 다른 일을 할 수 있도록 하는 것을 의미
*/

//produce로 만든 2개의 루틴은 무작위로 지정된 시간에 각각 A, B라는 문자열을 채널에 보내게 된다.
//이때 select 블록의 onReceive을 통헤 채널로 부터 이 값을 받아 먼저 완성된 결과를 가져옴.

fun main() = runBlocking {

    val routine1 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("A")
    }

    val routine2 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("B")
    }

    val result = select<String> {
        routine1.onReceive { result -> result }
        routine2.onReceive { result -> result }
    }

    println("Result was $result")

}