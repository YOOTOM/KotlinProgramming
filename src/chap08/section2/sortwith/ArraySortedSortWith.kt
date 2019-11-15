package chap08.section2.sortwith

//Comparator를 사용해 제품 비교하기
data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone A", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Smart Phone B", 1500.99),
        Product("Mouse", 512.99)
    )

    products.sortWith( //Comparator를 이용해 두 객체를 비교하여 p1이 크면 1, 같으면 0, 작으면 -1
        Comparator<Product> { p1, p2 ->
            //람다식이용
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    ) //출력-1
    //compareBy를 함께 사용해 2개의 정보 정렬
    //이름을 먼저 정렬하고 그 다음이 이름이 동일한 경우 가격 기준으로 다시 정렬
    //name을 정렬하고 Mouse처럼 이름이 같은 경우에는 다시 price를 기준으로 가격이 낮은 순서부터 정렬
    products.sortWith(compareBy({it.name}, {it.price}))// //출력-2
    products.forEach { println(it) }
}