package chap03.section4

import java.util.concurrent.locks.ReentrantLock

//공유 자원을 접근하는 코드 보호 하기
//동기화로 보호되는 코드느 임계 영역이라고 부른다.
//특정 공유 자원에 접근한다고 했을 떄 공유 자원이 여러 요소에 접근해서 망가지는 것을 막기 위해 임게 영역의 코드를 잠가 두었다가 사용한 후 풀어 줘야 한다.
var sharable = 1 //보호가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()

    //1,2,3 표현식이 모두 동일
    lock(reLock, { criticalFunc() }) //1
    lock(reLock) { criticalFunc() } //2
    lock(reLock, ::criticalFunc) //3

    println(sharable)
}

fun criticalFunc() {
    //공유 자원 접근 코드 사용
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}