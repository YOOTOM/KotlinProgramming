package chap04.section3

//조거에 따른 break사용하기
fun main() {
    /*for (i in 1..5) {
        if (i == 3) continue//break
        print(i)
    }
    println() //개행문자
    println("outside")*/

    //labelBreak()
    //labelBreak2()
    labelBreak3()
}

//break와 continue에 라벨 함께 사용하기
fun labelBreak() {
    println("labelBreak")
    for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

//first 밖으로
fun labelBreak2() {
    println("labelBreak2")
    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreak3() {
    println("labelBreak2")
    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}