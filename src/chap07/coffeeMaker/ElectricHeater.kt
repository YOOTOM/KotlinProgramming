package chap07.coffeeMaker

//전기 히터 ElectricHeater 클래스
class ElectricHeater(var heating: Boolean = false): Heater {
    override fun on() {
        println("[ElectricHeater] heating...")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean = heating
}