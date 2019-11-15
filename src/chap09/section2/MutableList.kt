package chap09.section2

//코틀린의 MutableList사용하기
fun main(){
    //가변형 List의 생성 및 추가, 삭제, 변경
    //mutableListOf()는 ArrayList가 아닌 MutableList를 반환하고 있다.
    val mutableList: MutableList<String> = mutableListOf<String>("msyoo","ssoni","chu")
    mutableList.add("Ben") //추가
    mutableList.removeAt(1) //인데스 1번 삭제
    mutableList[0] = "Sean" //인덱스 0번을 변경, set(index:Int, element:E)와 같은 역할
    println(mutableList)

    //자료형의 횬합
    val mutableListMixed = mutableListOf("Android", "Apple", 5,6,'X')
    println(mutableListMixed)
}