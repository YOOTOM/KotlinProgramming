package chap06.section3;

//자바에서 object 선언의 접근
//자바에서 object 선언으로 생성된 인스턴스에 접근하려면 INSTANCE를 사용한다.
public class OCustomerAccess {
    public static void main(String[] args) {
        String name = OCustomer.INSTANCE.getName(); //코틀린의 object 선언 객체의 메서드 접근
        System.out.println(name);
    }
}
