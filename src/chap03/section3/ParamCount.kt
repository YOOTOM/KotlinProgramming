package chap03.section3

// 람다식의 매개변수 테스트하기
fun main() {
    // 매개변수 없는 람다식
    noParam({ "Hello World" })
    noParam { "Hello World" }// 위와 동일 결과, 소괄호 생략 가능

    //매개변수가 1개 있을경우 변수(a)을 생성하여 람다식으로 표현이 가능하다.
    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" } //위와 동일한 결과, 소괄호 생략가능
    oneParam { "Hello World! $it" } //위와 동일한 결과, it으로 대체 가능 // $it은 람드식 매개변수로 지정된 String형과 매칭된다.

    //매개변수가 2개 있는 람다식
    moreParam { a, b -> "Hello World! $a $b" } //매개 변수 이름 생략 불가 //매개변수가 2개이므로 $it을 사용해 변수를 생략할 수 없다.

    //첫 번째 문자열은 사용하지 않고 생략
    moreParam { _, b -> "Hello,World! $b" }

    //1.인자와 함께 람다식을 사용하는 경우
    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" })

    //2.withArgs() 함수의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" }
}

// 매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())

//람다식의 매개변수가 1개인 경우
//매개변수가 1개 있는 람다식이 oneParam()함수의 매개 변수 out으로 지정됨
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

//매개변수가 2개 있는 람다식의 moreParam함수의 매개변수로 지정됨
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

//withArgs() 함수는 일반 매개변수 2개를 포함, 람다식을 마지막 매개변수로 가짐
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}