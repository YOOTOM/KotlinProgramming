package chap10.section1

//apply() 함수와 run() 함수 비교해보기
//apply() 함수는 this에 해당하는 객체를 반환
//run() 함수는 마지막 표현식 "success"을 반환

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("msyoo", "swkim")
    val retrunObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "sucess" //사용되지 않음
    }
    println(person)
    println("retrunObj: $retrunObj")

    println("============================================================")

    //마지막 표현식을 구성하지 않으면 Unit이 반환
    val retrunObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("retrunObj2: $retrunObj2")
}