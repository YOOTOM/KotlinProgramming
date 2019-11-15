package chap08.section2

import java.util.*

//기본적인 정렬 방법
fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    //오름차순, 내림차순으로 정렬된 일반 배열로 반환 -1
    //오름차순(ascending)
    val sortedNums = arr.sortedArray()
    println("ASC: " + Arrays.toString(sortedNums))
    //내림차순(descending)
    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DEC: "+ Arrays.toString(sortedNumsDesc))

    //원본 배열에 대한 정렬 -2
    //특정 인덱스 구간만 정렬할 수 있다.
    //인자를 생략하면 전체 요소를 대상으로 정렬한다.
    arr.sort(1,3) //sort(fromIndex, toIndex)
    println("ORI: " + Arrays.toString(arr))
    arr.sortDescending()
    println("ORI: "+ Arrays.toString(arr))

    //List로 반환 -3
    //Arrays.toString()으로 출력할 필요 없이 그대로 출력한다.
    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: " + listSorted)
    println("LST: " + listDesc)

    //SortBy를 이용한 특정 표현식에 따른 정렬
    //특정 표현식을 넣어 정렬
    //요소 길이가 가장 짧은 것을 먼져 나타내도록 item -> item.length와 같이 람다식 표현법을 사용해 짧은 단언의 문자열부터 정
    val items = arrayOf<String>("Dog","Cat","Lion","Kangaroo","Po")
    items.sortBy { item -> item.length }//길이가 가장 짧은 순으로 정렬
    println(Arrays.toString(items))
}