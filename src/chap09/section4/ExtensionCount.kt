package chap09.section4

//컬렉션의 요소 집계 확장 함수 사용하기
//집계 : 최대, 최소, 집합, 총합 등의 계산 기능

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    //요소의 순환
    //forEach 각 요소를 람다식으로 처리
    list.forEach { print("$it") }
    println()
    list.forEachIndexed { index, value -> println("index[$index] : $value") } //인덱스 포함

    //onEach: 각 요소를 람다식으로 처리 후 컬렉션으로 반환
    val returnedList = list.onEach { print(it) }
    println()
    val returnedMap = map.onEach { println("Key: ${it.key}, ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")

    //요소의 개수 반환하기
    //count: 조건에 맞는 요소 개수 반환
    println(list.count { it % 2 == 0 })

    //최댓값과 최솟값의 요소 반환하기
    //max/min: 최댓값 요소와 최솟값 요소의 반환
    println(list.max()) //6
    println(list.min()) //1

    //maxBy/minBy: 최댓값과 최솟값으로 나온 요소 it에 대한 식의 결과
    println("maxBy : " + map.maxBy { it.key }) //키를 기준으로 최댓값
    println("minBy : " + map.minBy { it.key }) //키를 기준으로 최솟값

    //각 요소에 정해진 식 적용하기
    //fold: 초깃값과 정해진 식에 따라 처음 요소부터 끝 요소에 적용하며 값을 생성
    println(list.fold(4) { total, next -> total + next }) //4 + 1 + ... + 6= 25
    println(list.fold(1) { total, next -> total * next }) //1 * 1 * 2 * ... * 6 = 720

    //모든 요소 합산하기
    //식에서 도출된 모든 요소를 합한 결과를 반환하려면 sumBy를 사용한다.
    //sumBy: 식에 의해 도출된 모든 요소를 합산
    //Pair로 묶인 요소의 첫 번째와 두 번째를 가리키는 first와 second가 멤버로 나타난다.
    //여기서 second요소를 모두 합한 결과를 가져온다.
    println(listPair.sumBy { it.second })


}