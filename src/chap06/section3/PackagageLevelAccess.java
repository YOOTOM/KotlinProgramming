package chap06.section3;

//자바에서 최상위 함수 접근하기
//자바 코드에서 코틀린 코드 접근하기
public class PackagageLevelAccess {
    public static void main(String[] args) {
        //이림이 자동 생성된 코틀린 클래스에 멤버 메서드처럼 접근할 수있다.
        //클래스 이름을 자동 생성하지 낳고 코틀린 코드에서 이름을 명시할 수 있다.
        //만일 접근한 클래스 이름을 바꾸고 싶다면 @file:JvmName("ClassName")을 코드 상단에 입력하면된다.

        //PackageLevelFunctionKt.packageLevelFunc();
        PKLevel.packageLevelFunc(); //변경된 이름으로 접근 가능
    }
}
