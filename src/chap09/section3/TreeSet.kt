package chap09.section3

import java.util.*

//TreeSet의 초기화

//sortedSetof()함수는 자바의 TreeSet컬렉션을 정렬된 상태로 반한다.
//TreeSet는 저장된 데이터의 값에 따라 정렬되는데, 일종의 탐색트리인 레드 블랙 트리 알고리즘을 사용해 자료구조를 구성한다.
//기존의 이진 탐색트리가 한쪽으로 치우친 트리 구조를 가지게 되는 경우 트리 높이만큼 시간이 걸리게 되는 최악의 경우가 생긴다.
//레드 블랙 트리는 요소를 빨강색과 검은색으로 구분해 치우친 결과 없이 트리의 요소를 배치한다.
//따라서 최악의 요소 배치가 되어도 검색등의 처리에서 일정한 시가늘 보장하는 자료구조이다.
//HashSet보다는 성능이 좀 떨어지고 데이터를 추가하거나 삭제하는데 시간이 걸리지만 검색과 정렬이 뛰어나다는 장점이 있다.한

//TreeSet도 마찬가지로 가변성만 사용할 수 있기 때문에 요소의 추가 및 삭제 등이 가능하다.

fun main() {
    //자바의 java.util.TreeSet선언
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)

    println("intsSortedSet = ${intsSortedSet}")

    intsSortedSet.clear() //모든 요소 삭제
    println("intsSortedSet = ${intsSortedSet}")

}