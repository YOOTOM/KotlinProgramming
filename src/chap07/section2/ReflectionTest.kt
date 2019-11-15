package chap07.section2

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

//리플렉션 테스하기
//리플렉션 : 사전적으로 '반사'나 '투영'을 뜻하는 리플렉션이란 프로그램을 실행할 때 프로그램의 특정 구조를 분석해 내는 기법
class User(val id : Int, val name: String, var grade: String = "Normal") {
    fun check() {
        if(grade == "Normal") println("You need to get the Silver grade")
    }
}

fun main() {
    //타입을 출력
    println(User::class) //클래스 레퍼런스를 위해 ::class사용
    //클래스의 프로퍼티와 메서드의 정보를 출력
    val classInfo = User::class
    //forEach : 반복을 통해 화면에 출력
    //여기서 이름과 자료형이 출력
    //메서드에서는 구현한 check 외에도 equals,hashCode,toString을 기본적으로 가지고 있는 것을 확인
    classInfo.memberProperties.forEach {
        println("Property name : ${it.name}, type: ${it.returnType}")
    }
    classInfo.memberFunctions.forEach {
        println("Function name: ${it.name}, type: ${it.returnType}")
    }
    //함수에 전달해 자료형을 알아냄
    getKotlinType(User::class)

}

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}