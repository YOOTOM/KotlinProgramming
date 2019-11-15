package chap07.coffeeMaker

//히터 Heater 인터페이스
interface Heater {
    fun on()
    fun off()
    fun isHot() : Boolean
}