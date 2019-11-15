package chap04.section3

import java.lang.ArithmeticException
import java.lang.Exception

//0으로 나누었을 때 예외 처리하기
fun main() {
    val a = 6
    val b =0
    val c : Int

    /*try {
        c = a/b //0으로 나
    }catch (e : Exception){
        println("Exception is handled.")
    }finally {
        println("finally 블록은 반드시 항상 실행됨")
    }*/

    //특정 예외 처리
    //산술 연산에 대한 예외를 따로 특정해서 잡으려면 ArithmeiticException을 사용
    //Arithmetic : 산술
    //좀더 자세하게 오류 출력이 가능하다.
    /*try {
        c = a/b //0으로 나눔
    }catch (e : ArithmeticException){
        println("Exception is handled. ${e.message}")
    }finally {
        println("finally 블록은 반드시 항상 실행됨")
    }*/

    //스택의 추적
    //임시 메모리 영억인 스택을 추적할 수 있도록 코드를 작성
    try {
        c = a/b //0으로 나눔
    }catch (e : Exception){
        e.printStackTrace()
    }finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}