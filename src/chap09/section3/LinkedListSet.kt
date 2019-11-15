package chap09.section3

//LinkedHashSet의 초기화
//저장된 순서에 따라 값이 정렬되며 앞에서 언급한 HashSet, TreeSet보다 느리다.
//자료구조상 다음 데이터를 가리키는 포인터 연결을 통해 메모리 저장 공간을 좀더 효율적으로 사용할 수 있다.

fun main() {
    //Linked list를 이용한 HashSet
    val intsLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intsLinkedHashSet.add(4)
    intsLinkedHashSet.remove(21)

    println(intsLinkedHashSet)
    intsLinkedHashSet.clear()
    println(intsLinkedHashSet)
}