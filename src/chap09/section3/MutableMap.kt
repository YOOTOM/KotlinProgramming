package chap09.section3

//가변형 Map사용하기
//mutableMapOf()함수는 추가,삭제가 가능한 가변형 Map을 정의한다.
//이 함수는 MutableMap(K,V)인터페이스 자료형을 반환한다.
//MutableMap은 MutableCollection의 내용을 상속받지 않고 Map에서 확장 되었다.
//따라서 Map으로 부터 메서드를 사용할 수있다.
fun main() {
    //가변형 Map의 선언 및 초기화
    val capitalCityMap: MutableMap<String, String> //선언할 때 키와 값의 자료형을 명시할 수 있음
            = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japen" to "Tokyo") //~의
    println(capitalCityMap.values) //값만출력
    println(capitalCityMap.keys) //키만 출력

    //put(키,값)형태로 요소를 추가하거나 remove(키) 형태로 요소를 삭제할 수 있다.
    capitalCityMap.put("UK", "London") //요소의 추가
    capitalCityMap.remove("China") //요소의 삭제
    println(capitalCityMap)
}