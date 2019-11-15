package chap09.section2

//각 요소 순환하기
//배열과 마찬가지로 List같은 컬렉션에서 요소를 순환하기 위해 for문을 사용할 수 있다.
fun main() {
    val fruits = listOf("apple", "banana", "kiwi")
    for (item in fruits) {
        println(item)
    }

    println()

    //요소의 인덱스를 통해 List에 접근하려면 컬렉션에 .indices 멤버를 추가하면 된다.
    for (index in fruits.indices) { //인덱스 지정
        println("fruits[$index] = ${fruits[index]}")
    }

    println()

    //인덱스로 값을 얻을 땐 나머지 연산자(%)사용해 index%2==0과 같이 작성하면 인덱스 0번과 짝수 요소만 골라 낼 수 있다.
    for (index in fruits.indices) {
        if (index % 2 == 0) println("fruits[$index] = ${fruits[index]}") //짝수만 고르기
    }

    println()

    //while문을 사용해 출력하려면 인덱스는 0번부터 시작하므로 멤버 변수 size보다 하나 작은 횟수만큼 반복해 읽을 수 있다.
    //출력 결과는 앞에서 .indices를 사용했을 때 와 동일하게 나타난다.
    var index = 0
    while (index < fruits.size) {
        println("fruits[$index] = ${fruits[index]}")
        index++
    }

    println()

    //비어 있는 List를 생성하려면 emptyList<>() 사용한다.
    //String형의 빈List를 갖기 위해 다음과 같이 선언할 수 있다.
    val emptyList: List<String> = emptyList<String>()

    println()

    //listOfNotNull()로 초기화하면 null을 제외한 요소만 반환에 List를 구성할 수 있다.
    //다음 코드에서는 null이 아닌요소만 골라 컬렉션을 초기화 한다.
    val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)
    println(nonNullsList)

}