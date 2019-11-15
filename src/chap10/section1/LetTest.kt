package chap10.section1

//let() 함수 사용해 보기
//score는 null가능성이 있는 변수로 선언되었기 때문에 checkScore()에서 if문을 사용해 null검사를 하고 있다.
fun main() {
    val score: Int? = 32
    //var scroe = null

    //일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    //let 함수를 사용해 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score: $it") }
        val str = score.let { it.toString() }
        println(str)
    }
    checkScore()
    checkScoreLet()
}