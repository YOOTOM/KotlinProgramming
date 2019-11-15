package chap05.section6.composition

//구성 관계 나타내기
class Car(val name: String, val power: String) {
    private var engine = Engine(power) //Engine 클래스 객체는 Car에 의존적

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {  //Engine클래스는 Car클래스의 생명주에 의존적
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stoped.")
}

fun main() {
    val car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}