package chap07.section2

//+연산자의 오버로딩
class Point(var x: Int = 0, var y: Int = 10) {
    //plus() 함수의 연산자 오버로딩
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }

    operator fun dec() = Point(--x, --y)
}

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var point = Point()
    point = p1 + p2 //Point 객체의 + 연산이 가능하게 됨 p1.plus(p2)
    println("point = (${point.x}, ${point.y})")

    //x와 y값을 하나씩 줄일 수 있는 --감소 연산자가 정의됨
    --point // --연산자
    println("point = (${point.x}, ${point.y})")
}