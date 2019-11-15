package chap09.section4

//순서와 정렬 연산 사용하기
fun main() {
    //reversed: 뒤집힌 순서로 컬렉션 반환
    val unsortedList = listOf(3, 5, 7, 2)
    println(unsortedList.reversed())

    //sorted: 요소를 정렬한 후 정렬된 컬렉션 반환
    println(unsortedList.sorted())

    //sortedDescending: 내림차순 정렬
    println(unsortedList.sortedDescending())

    //sortedBy: 특정 비교식에 의해 정렬된 컬렉션 반환
    println(unsortedList.sortedBy { it % 3 })
    //큰수에서 작은수로
    //2,5가 값이 같기 때문에 동일한 결과를 나오는 것 같
    println(unsortedList.sortedByDescending { it % 3 })
}