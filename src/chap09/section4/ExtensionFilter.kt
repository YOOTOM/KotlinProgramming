package chap09.section4

//컬렉션의 필터와 추출 확장 함수 사용하기
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6) //일반 Integer
    val listMixed = listOf(1, "Hello", 3, "World", 5, "A") //혼합 자료형
    val listWithNull = listOf(1, null, 3, null, 5, 6) //null 포함
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6) //중복 자료
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++") //맵핑

    //특정 요소 골라내기
    //filter: 식에 따라 요소를 골라내기
    println(list.filter { it % 2 == 0 }) //짝수만 골라내기
    println(list.filterNot { it % 2 == 0 }) //식 이외에 요소 골라내기
    println(listWithNull.filterNotNull()) //null을 제외

    println("============================================================")

    //filterIndexed: 인덱스와 함께 추출
    println("filterIndexed: " + list.filterIndexed { idx, value -> idx != 1 && value % 2 == 0 })

    //filterIndexedTo: 추출 후 가변형 컬렉션으로 변환
    //메서드 이름에 To가 붙은 filterIndexedTo는 filterIndexed에 컬렉션으로 반환되는 기능이 추가되어 있다.
    val mutlist = list.filterIndexedTo(mutableListOf()) { idx, value -> idx != 1 && value % 2 == 0 }

    println("filterIndexedTo: $mutlist")

    println("============================================================")

    //Map에서 키와 값에 대한 필터를 추
    //filterKeys/FilterValue: Map의 키, 값에 따라 추출
    println("filterKeys: " + map.filterKeys { it != 11 }) //키 11을 제외한 요소가
    println("filterValues: " + map.filterValues { it == "Java" }) //값이 "Java"인 요소

    println("============================================================")

    //filterIsInstance: 여러 자료형의 요소 중 원하는 자료형을 골라냄
    println("filterIsInstnce: " + listMixed.filterIsInstance<String>())

    println("============================================================")

    //특정 범위를 잘라내거나 반환하기
    //slice: 특정 인덱스의 요소들을 잘라서 반환하기
    //인덱스 0~2번에 해당하는 1,2,3이 list에 추출되어 반환된다.
    println("slice: " + list.slice(listOf(0, 1, 2)))

    println("============================================================")

    //take: n개의 요소를 반환
    println(list.take(2)) //앞 두 요소 반환
    println(list.takeLast(2)) //마지막 두 요소 반환
    println(list.takeWhile { it < 3 }) //조건식에 따른 반환

    println("============================================================")

    //특정 요소 제외하기
    //drop: 처음부터 n개의 요소를 제외한 List반환
    println(list.drop(3)) //앞의 요소 3개 제외하고 반환
    println(list.dropWhile { it < 3 }) //3미만을 제외하고 반환
    println(list.dropLastWhile { it > 3 }) //3초과를 제외하고 반환

    println("============================================================")

    //각 요소의 반환
    //각 요소는 componentN()과 대응
    //N은 인덱스 번호가 아닌 1부터 시작하는 요소의 순서 번호이다.
    //따라서 5개면 1부터 5까지 가진다.
    println("component1(): " + list.component1()) //첫 번째 요소인 1 반환

    println("============================================================")

    //합집합과 교집합
    //distinct: 중복 요소는 하나로 취급해 List반환
    println("distinct: " + listRepeated.distinct())

    //intersect: 교집합 요소만 골라냄
    println("intersect: " + list.intersect(listOf(5, 6, 7, 8)))

    println("============================================================")

}