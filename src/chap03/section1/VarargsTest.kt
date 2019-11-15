package chap03.section1

//다양한 인자의 개수를 전달받는 함수
//가변인자(Variable Argument)를 사용하면 함수는 하나만 정의해 놓고 여러 개의 인자를 받을 수 있다.
//함수를 선언할 때 매개변수 왼쪽에 vararg라는 키워드를 붙이면 된다.
fun main() {
    normalVarargs(1, 2, 3, 4) // 4개의 인자 구성
    normalVarargs(4, 5, 6) //3개의 인자 구성
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        print("$num")
    }
    print("\n")
}