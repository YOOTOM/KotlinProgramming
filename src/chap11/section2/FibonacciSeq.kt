package chap11.section2

//sequence()함수를 사용한 피보나치 수열
val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    //각 표현식을 계속 진행하기 전에 실행을 잠시 멈추고 요소를 반
    yield(1) //지연 함수가 사용됨

    while (true) {
        yield(a + b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

val seq = sequence {
    val start = 0
    yield(start) //단일 값 산출
    //yieldAll()을 사용해 반복적으로 멈추게 되면서 특정 범위의 값을 산출할 수 있다.
    yieldAll(1..5 step 2) //반복 값 산출
    //yieldAll()을 사용해 무한한 시퀀스를 만들어 내는 generateSequence()함수를 사용해서도 요소 값을 산출할 수 있다.
    yieldAll(generateSequence(8) { it * 3 }) //무한한 시퀀스에서 산출
}

fun main() {
    // println(fibonacciSeq.take(8).toList()) //8개의 값을 획득
    //println(seq.take(7).toList())

    //모든 요소는 일회성이기 때문에 각 요소에 대한 다음 요소를 직접 지정하려면 iterator()를 통해 next()메서드를 사용해야 한다.
    val saved = fibonacciSeq.iterator()
    println("${saved.next()}.${saved.next()},${saved.next()}")
}