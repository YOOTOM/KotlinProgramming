package chap06.section2

//lateinit을 사용해 지연 초기화하기
/*
    lateinit의 제한
        - var로 선언된 프로퍼티만 가능
        - 프로퍼티에 대한 게터와 세터를 사용할수 없다.
* */
class Person {
    lateinit var name: String //지연 초기화를 위한 선언

    fun test() {
        //프로퍼티 참조를 위해 콜론 2개(::)
        //false
        if (!::name.isInitialized) { //프로퍼티의 초기화 여부 판단
            println("not initialized")
            //true
        } else {
            println("initialized")
        }
    }
}

data class Person2(var name: String, var age: Int)

lateinit var person2: Person2 //객체셍성의 지연 초기화

fun main() {
    val msyoo = Person()
    msyoo.test()
    msyoo.name = "msyoo" //이 시점에서 초기화됨(지연초기화)
    msyoo.test()
    println("name = ${msyoo.name}")

    //실제로 person2의 초기화는 main()함수 블록 본문에서 생성자를 통해 초기화
    person2 = Person2("msyoo", 30) //생성자 호출 시점에서 초기화됨
    println(person2.name + " is " + person2.age.toString())
}