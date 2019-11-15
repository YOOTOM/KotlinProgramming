package chap10.section1

//apply()함수 사용해보기
fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("msyoo", "swkim")
    person.apply { this.skills = "swift" } //여기서 this는 person 객체를 가리킴
    println(person)

    val returnObj = person.apply {
        name = "Sean" //this는 생략할 수 있음
        skills = "Java" //this없이 객체의 멤버에 여러 번 접근
    }
    println(person)
    println(returnObj)

}