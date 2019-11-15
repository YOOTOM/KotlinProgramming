package chap09.section5

//요소 값 생성하기
//generateSequence()로 생성하기
//시퀀스 사용하기
fun main() {
    //시드 값 1을 시작으로 1씩 증가하는 시퀀스 정의
    val nums: Sequence<Int> = generateSequence(1) { it + 1 }

    //take()를 사용해 원하는 요소 개수만큼 획득하고 toList()를 사용해 List컬렉션으로 반환
    //nums에는 take(10)의 인자를 통해 원하는 개수만큼 요소가 저장되며 toList()를 통해 원하는 개수만큼 요소가 저장되며
    //toList를 통해 List컬렉션으로 반환한다.
    println(nums.take(10).toList())

    println("============================================================")

    //주어진 식에 따라 새로운 컬렉션을 반환하는 map이나 filter같은 연산을 사용할 수도 있다.
    //메서드 체이닝이
    val squares = generateSequence(1) { it + 1 }.map { it * it }
    println(squares.take(10).toList())

    val oddSquares = squares.filter { it % 2 != 0 }
    println(oddSquares.take(5).toList())


}