package chap04.section1

//else if문을 사용한 등급 판별하기
//코틀린의 표준 라이브러리, readLine()함수
//readLine()함수는 콘솔로부터 문자열을 입력받는 함수이다.
fun main() {
    println("Enter the scroe : ")
    //readLine()에거 null이거나 입력받은 값을 실수형으로 변환하지 못할 예외가 발생할 수있어
    //null검사(?.)하나 non-null단정 기호 (!!.)를 사용해 받아들일수 있다.
    val score = readLine()!!.toDouble() //콘솔로부터 입력 받음
    var grade: Char = 'F'

    /*if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >= 70.0 && score <= 79.9) {
        grade = 'C'
    }*/
    //위 조건관 같다. (in .. )
    if (score >= 90.0) {
        grade = 'A'
    } else if (score in 80.0 .. 89.9) {
        grade = 'B'
    } else if (score in 70.0 .. 79.9) {
        grade = 'C'
    }



    println("Scroe: $score, Grade: $grade")
}