package chap02.section3

//자료형 검사하기
fun main() {
    /*val num = 256

    if(num is Int){ //num이 Int형 일떄
        println(num)
    } else if (num !is Int){ /// num이 Int 형이 아닐떄, !(num is int) 와 동일
        println("Not a Int")
    }*/

    //Any형 사용하기
    val x: Any
    x = "Hello" //Any 형

    if (x is String){
        println(x.length) //x는 자동적으로 String으로 스마트 캐스트

    }
}