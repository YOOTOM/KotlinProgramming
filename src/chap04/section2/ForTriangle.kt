package chap04.section2

//반복문을 이용해 삼각형 출력하기
fun main() {
    print("Enter the lines: ")
    //readLine()함수로 값을 입력받기
    val n = readLine()!!.toInt() //콘솔로부터 입력 받음 //non-null단정 기호(!!.)

    for (line in 1..n) {
        for (space in 1..(n - line)) print(" ") //공백출력
        for (star in 1..(2 * line - 1)) print("*") //별표출력 //홀수
        println() //개행
    }

}