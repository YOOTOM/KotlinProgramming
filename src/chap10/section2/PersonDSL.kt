package chap10.section2

//Person을 위한 DSL만들어 보기
data class Person(
    var name: String? = null,
    var age: Int? = null,
    var job: Job? = null
)

data class Job(
    var category: String? = null,
    var position: String? = null,
    var extenstion: Int? = null
)

fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun Person.job(block: Job.() -> Unit) {
    job = Job().apply(block)
}

fun main() {
    val person = person {
        //간단한 DSL이 적용된 생성 방법
        name = "msyoo"
        age = 30
        job {
            category = "IT"
            position = "Android Developer"
            extenstion = 1234
        }
    }
    println(person)
}