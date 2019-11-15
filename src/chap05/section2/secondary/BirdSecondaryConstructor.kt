package chap05.section2.secondary

//부 생성자를 사용하는 Bird 클래스
class Bird {

    //프로퍼티 - 선언만함
    var name: String
    var wing: Int
    var beak: String
    var color: String

    /*//부 생성자 - 매개변수를 통해 초기화할 프러퍼티에 지정
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name //this.name은 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing = wing
        this.beak = beak
        this.color = color
    }*/

    //this 키워드를 사용하지 않고 부 생성자 생성하기
    //(_) 언더스코어 이용
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    //두번 째 부 생성
    //매개변수를 다르게 정의
    //프로퍼티를 하드코딩이라도 값을 넣어줘야지 안넣어주면 오류가 발생함
    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }

    //매서드
    fun fly() = println("Fly wing : $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")

    fun naming() = println("name : $name")
}

fun main() {
    val coco1 = Bird("mybird", 2, "short", "blue") //생성자의 인자로 객체 생성과 동시에 초기화
    val coco2 = Bird("mybird2", "long")

    coco1.color = "yellow"
    println("coco.color : ${coco1.color}")
    coco1.fly()
    coco1.sing(3)

    coco2.naming()

}