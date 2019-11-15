package chap04.section2

//do~while문 사용해보기
fun main() {
    do { //한번씩 실행 하고 while문에서 체크
        print("Enter an integer: ")
        val input = readLine()!!.toInt()

        //나머지 연산자로 숫자 범위 제한하기
        //정해진 숫자가 5라면 0,1,2,3,4,0,1,2,3,4,0...형태로 반복
        for (i in 0..(input - 1)) {
            for (j in 0..(input - 1)) print((i + j) % input + 1)
            println()
        }
    } while (input != 0) //조건을 만족할때까지 반복 // 만족하지 않으면 그이후로 진행
}