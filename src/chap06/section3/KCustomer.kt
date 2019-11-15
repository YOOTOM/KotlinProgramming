package chap06.section3

class KCustomer {
    companion object{
        //컴파일 시간의 상수 const
        //val과 다르게 컴파일 시간에 이미 값이 할당되는 것으로 자바에서 접근하기 위해서 필요
        //val은 실행 시간에 할당
        //const는 Int형,Double형과 같이 기본형으로 사용할 자료형과 String 형에만 적용할 수 있다.
        const val LEVEL = "INTERMEDIATE"
        //@JvmStatic 애노테이션은 자바 소스에서 코드를 해석할 때 Companion을 생략할 수 있게 한다.
        //함수 이름 위에 작성한다.
        @JvmStatic fun login() = println("Login...") //애노테이션 표기 사용
        //프로퍼티를 자바에서 사용하고나 할 경우에는 @JvmField 애노테이션을 사용
        @JvmField val JOB = KJob() //특정 자료형 사용하기 위한 애노테이션
    }
}

class KJob {
    var title: String = "Programer"
}