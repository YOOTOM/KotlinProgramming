package chap05.section4.personthis

//this와 super를 사용하는 부 생성자
open class Person {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) {
        println("[Person] firstName: $firstName, $age") //-1 순서
    }
}

class Developer : Person {
    constructor(firstName: String) : this(firstName,10) { //같은 클래스의 생성자를 가르킴,  아래의 생성자
        println("[Developer] $firstName") //-3
    }

    constructor(firstName: String, age: Int): super(firstName,age) { //부모 클래스의 생성자를 가르킴
        println("[Developer] $firstName, $age") //-2
    }
}

fun main(){
    Developer("Sean")
}