package chap03.section1


//함수의 호출 원리 살펴보기
fun main() { // 최초의 스택 프레임
    val num1 = 10 // 임시 변수 혹은 지역 변수
    val num2 = 3 // 임시 변수 혹은 지역 변수
    val result: Int //불변하는 Int형 타입의 result

    result = customMax(num1, num2) // 두번째 스택 프레임
    println(result)
}

//두 수중 더 큰수를 반환하는 함수 max()를 선언하고 호출 하는 코드
//customMax() 함수에는 축약한 형태의 if~else문이 들어 있다.
fun customMax(a: Int, b: Int) = if (a > b) a else b // a와 b는 customMax()함수의 임시 변