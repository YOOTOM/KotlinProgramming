package chap06.section2.bylazyobj

//by lazy로 선언된 객체 지연 초기화하기
class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false // 초기화 확인 용도

    //lazy의 2가지 방법의 지연초기화
    //by lazy를 사용해 person객체를 지연 초기화
    val person: Person by lazy {
        //lazy
        isPersonInstantiated = true //초기화
        Person("Kim", 23) // 이 부분이 Lazy 객체로 반환됨
    }
    //lazy만 사용해 위임 변수를 받아서 지연 초기화
    val personDelegate = lazy {
        Person("Hong", 40)
    } //위임 변수를 사용한 초기화

    println("person Init : $isPersonInstantiated")
    println("personDelegate init : ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") //이 시점에서 초기화
    //value를 한 단계 더 거쳐 객체의 맴버인 value.name과 같은 형태로 접근
    println("personDelegate.value.name = ${personDelegate.value.name}") //이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

}