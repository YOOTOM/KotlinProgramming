package chap07.coffeeMaker

//열사이펀 Thermosiphon 클래스
class Thermosiphon(heater: Heater) : Pump, Heater by heater { //위임의 사용
    override fun pump() {
        if(isHot()) {
            println("[Thermosiphon] pumping...")
        }
    }
}

