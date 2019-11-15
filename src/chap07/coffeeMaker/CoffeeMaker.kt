package chap07.coffeeMaker

//커피 제조기 CoffeMaker 클래스와 생성 테스트하기
class CoffeeMaker(val coffeeModule: CoffeeModule) {
    fun brew() {
        val theSiphon: Thermosiphon = coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, here! Enjoy!~")
        theSiphon.off()
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}
//인터페이스를 사용하는 가장 큰 이유는 특정 구현에 의존적이지 않은 코드를 만들 수 있다는 점
//그래서 기능의 정의와 구현을 분히할 수 있고 구현 내용을 확장하거나 교체하기 쉽다.
//프로젝트가 점점 커질수록 확장이 쉬운 구조로 만들고 싶다면 인터페이스를 이용해야한다.