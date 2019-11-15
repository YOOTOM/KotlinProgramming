package chap09.section5

//asSequence()의 시간 성능 알아보기
//작은 컬렉션에는 시퀀스를 사용하지 않는 것이 좋다.
//시퀀스를 사용하면 람다식을 저장하는 객체로 표현되기 때문에 인라인되지 않아 작은 컬렉션에는 오히려 좋지 않다.
//한 번 계산된 내용은 메모리에 저장하기 때문에 시퀀스 자체를 인자로 넘기는 형태는 사용하지 않는 것이 좋다.
fun main() {
    val listBench = (1..1_000_000).toList()
    timeElapsed {
        listBench
            .map { it + 1 }
            .first { it % 100 == 0 }

    }

    timeElapsed {
        listBench
            .asSequence()
            .map { it + 1 }
            .first { it % 100 == 0 }
    }
}

fun timeElapsed(task: () -> Unit) {
    val before = System.nanoTime()
    task()
    val after = System.nanoTime()
    val spped = (after - before) / 1_000
    println("$spped ns")

}