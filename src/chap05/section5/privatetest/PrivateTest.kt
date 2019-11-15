package chap05.section5.privatetest

private class PrivateClass{
    private var i = 1
    private fun privateFunc() {
        i += 1 //접근 허용
    }
    fun access() {
        privateFunc() //접근 허용
    }
}

/*class OhterClass {
    val opc = PrivateClass() //불가 - 프로퍼티 opc는 private이 되어야 함
    fun test() {
        val pc = PrivateClass() // 생성가능 //private
    }
}

fun main() {
    val pc = PrivateClass() //생성가능
    pc.i //접근 불가
    pc.privateFunc() //접근불가
}*/

fun TopFunction() {
    val tpc = PrivateClass() //객체 생성 가능
}






