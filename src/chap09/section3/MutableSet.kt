package chap09.section3

//가변형 Set의 초기화
//요소는 중복되지 않고 유일해야만 한다.
fun main() {
    //불변형 Set정의하기
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)

    //요소의 추가
    animals.add("Dog") //요소 중 "Dog"가 이미 존재하므로 변화 없음
    println(animals)

    //요소의 삭제
    animals.remove("Python")
    println(animals)
}