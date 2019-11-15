package chap04.section3

import chap03.section3.lambda

fun main() {
    retfunc()
}

fun inlineLamda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline
    out(a, b)
}

/*
//명시적 라벨
fun retfunc(){
    println("start of reFunc")
    inlineLamda(13,3) lit@ {a,b-> //1 람다식 블록의 시작 부분에 라벨을 지정
        val result = a+b
        if(result > 10) return@lit //2 라벨을 사용한 블록의 끝부분으로 반환
        println("result : $result")
    } //3 이부분으로 빠져나감
    println("end of retFunc") //4 이부분이 실행
}
*/
//암묵적 라벨
/*fun retfunc() {
    println("start of reFunc")
    inlineLamda(13, 3) { a, b ->
        //1 람다식 블록의 시작 부분에 라벨을 지정
        val result = a + b
        if (result > 10) return@inlineLamda //2 라벨을 사용한 블록의 끝부분으로 반환
        println("result : $result")
    } //3 이부분으로 빠져나감
    println("end of retFunc") //4 이부분이 실행
}*/

//익명함수를 사용한 반환
//람다식 대신에 익명함수를 넣는다.
/*fun retfunc() {
    println("start of reFunc")
    inlineLamda(13, 3, fun(a, b) {
        val result = a + b
        if (result > 10) return
        println("result : $result")
    })
    println("end of retFunc")
}*/

//return이 여러번 사용될때 유용
//람다식 방법
/*fun retfunc() {
    //return이 여러번 사용될때 유용
    val getMessage = lambda@{ num: Int ->
        if (num !in 1..100) {
            return@lambda "Error" //라벨을 통한 반환
        }
        "Success" //마지막 식이 반환
    }

    println(getMessage(110))
}*/

//return이 여러번 사용될때 유용
//익명 함수 방법
fun retfunc() {
    //return이 여러번 사용될때 유용
    val getMessage = fun(num : Int) : String {
        if (num !in 1..100) {
            return "Error" //라벨을 통한 반환
        }
        return "Success" //마지막 식이 반환
    }

    println(getMessage(10))
}