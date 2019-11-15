package chap09.section3

//불변형 Map사용하기
fun main() {
    //불변형 Map의 선언 및 초기화
    val langMap: Map<Int, String> = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    for ((Key, value) in langMap) { //키와 값의 쌍을 출력
        println("Key=$Key, vlaue=$value")
    }
    //Map의 값을 출력하기 위해 대괄호를 사용할 때는 인데스가 아닌 키를 사용하고 있음을 주의
    println("langMap[22] = ${langMap[22]}") //키 22에 대한 값 출력
    println("langMap.get(22) = ${langMap.get(22)}") //위와 동일한 표현
    println("langMap.keys = ${langMap.keys}") //맵의 모든 키

}