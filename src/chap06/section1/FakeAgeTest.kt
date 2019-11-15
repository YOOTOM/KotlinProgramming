package chap06.section1

//세터를 이용한 나이 속이기
fun main() {
    val yoo = FakeAge()
    yoo.age = 15 //세터
    println("YOO's real age = 15, pretended age = ${yoo.age}")

    val kim = FakeAge()
    kim.age = 35 //세터
    println("kimm's real age = 35, pretended age = ${kim.age}")
}

class FakeAge {
    var age: Int = 0
        set(value) { //나이에 따라 판면하는 세터
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}