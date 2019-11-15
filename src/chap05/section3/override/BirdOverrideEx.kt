package chap05.section3.override

//상속 가능한 클래스를 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    //메서드
    fun fly()  = println("Fly wing: $wing")
    open fun sing(vol: Int) = print("Sing vol: $vol") //오버라이딩 가능한 메서드
}

class Parrot(name: String, wing: Int=2, beak: String, color: String, var language: String = "natural") : Bird(name, wing, beak, color){
    fun speck() = println("Speck! $language")

    override fun sing(vol: Int) {
        println("I'm a parrot! The volume level is $vol")
        speck() //달라진 내용
    }
}

fun main() {
    val parrot = Parrot(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}.${parrot.language}")

    parrot.sing(5) //달라진 메서드 실행 가능
}