package chap09.section5

//단순 메서드 체이닝 및 asSequence() 사용하기
fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val listDafault = list1
        .map { println("map($it)"); it * it } //연산이 마무리 된후 새로운 List가 반환 되고
        .filter { println("filter($it)"); it % 2 == 0 } //이것을 다시 filter메서드로 처리
    println(listDafault)

    println("============================================================")

    //asSequence()을 통해 가져오기
    //map의 수행 결과를 새로운 List에 만들고 이것을 다시 짝수인지 판별해 리스트를 만드는 과정이 없어짐
    //시퀀스를 사용하면 요소의 개수가 많을 때 속도나 메모리 측면에서 훨씬 좋은 성능을 낼 수 있다.
    val listSeq = list1.asSequence()
        .map { print("map($it)"); it * it }
        .filter { println("filter($it)"); it % 2 == 0 }
        .toList()
    println(listSeq)


}