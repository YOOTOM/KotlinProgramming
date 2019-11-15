package chap09.section4

//요소 처리와 검색 사용하기
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("A", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    //elementAt: 인덱스에 해당하는 요소 반환
    println("elementAt: " + list.elementAt(1))

    //elementAtOrElse: 인덱스를 벗어나는 경우 식에 따라 결과 반환
    println("elementAtOrElse: " + list.elementAtOrElse(10, { 2 * it })) //it : index
    //elementAyOrElse(10}{2*it}) 표현식과 동일

    //elementAtOrNull: 인덱스를 벗어나는 경우 null반환
    println("elementAtOrNull: " + list.elementAtOrNull(10))

    println("============================================================")

    //first: 식에 일치하는 첫 요소 반환
    println("first: " + listPair.first { it.second == 200 })

    //last: 식에 일차하는 마지막 요소 반환
    println("last: " + listPair.last { it.second == 200 })

    //firstOrNull: 식에 일치하지 않는 경우 null반환
    println("firstOrNull: " + listPair.firstOrNull { it.first == "E" })

    //lastOrNull: 식에 일치하지 않는 경우 null반환
    println("lastOrNull: " + listPair.lastOrNull { it.first == "E" })

    println("============================================================")

    //indexOf: 주어진 요소에 일치하는 첫 인덱스 반환
    println("indextOf: " + list.indexOf(4))

    //indexOfFirst: 람다식에 일치하는 첫 요소의 인덱스 반환, 없으면: -1
    println("indextOfFirst: " + list.indexOfFirst { it % 2 == 0 })

    //lastIndextOf: 주어진요소에 일치하는 가장 마지막 인덱스 반환
    println("lastIndextof: " + listRepeated.lastIndexOf(5))

    //indexOfLast: 람다식에 일치하는 마지막 요소의 인데스 반환, 없으면 -1
    println("indexOfLast: " + list.indexOfLast { it % 2 == 0 })

    println("============================================================")

    //single: 람다식에 일치하는 요소 하나 반환, 없으면 오류 메시지
    println("single: " + listPair.single { it.second == 100 })
    //single: 람다식에 일치하는 요소 하나 반환, 없으면 null반환
    println("singleOrNull: " + listPair.singleOrNull { it.second == 500 })

    println("============================================================")

    //binarySearch: 요소에 대해 이진 탐색 후 인덱스 반환
    println("binarySearchL " + list.binarySearch(3))

    //find: 조건식을 만족하는 첫 번째 검색된 요소 반환, 없으면 null
    println("find: " + list.find { it > 3 })

}