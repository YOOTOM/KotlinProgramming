package chap08.section2

//sortBy() 사용해 보기
//Array에서 확장된 sortBy() 함수를 이용하면 해당 멤버 변수에 따라 정렬할 수 있다.
data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Moniter", 1500.99),
        Product("Tablet", 512.99)
    )
    //it 사용 : 람다의 파라미터가 하나인경우 컴파일러가 추론 가능
    //중첩된 람다에서는 it 보다는 파라미터를 명시하는 것이 좋다
    products.sortBy { it.price }//값에 따라 정렬 //오름차순 //it -> 인자값 받기 //람다식
    products.forEach { println(it) } //각각출력 //람다식
}