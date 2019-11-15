package chap04.section1

//when문을 이용행 점수 등급 구하기
//앞에서 작성한 예제보다 코드 양이 많이 줄어들고 일기 좋은 코드가 되었다.
fun main() {
    print("Enter the score : ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }

    println("Scroe: $score, Grade: $grade")
}