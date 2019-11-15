package chap07.section1

//여러 인터페이스를 이용한 다중 상속
interface Bird {
    val wings: Int
    fun fly()
    fun jump() {
        println("bird jump!")
    }
}

interface Horse {
    val maxSpeed: Int
    fun run()
    fun jump() {
        println("jump!, max speed: $maxSpeed")
    }
}

class Pegasus: Bird, Horse {
    override  val wings: Int = 2
    override  val maxSpeed: Int = 100
    override fun fly() {
        println("Fiy!")
    }
    override fun run() {
        println("Run!")
    }

    override fun jump() {
        super<Horse>.jump()
        println("Pegasus Jump!")
    }
}

fun main() {
    val pegasus = Pegasus()
    pegasus.fly()
    pegasus.run()
    pegasus.jump()
}