//중첩 메서드와 바깓 멤버
class A8{
    //인스턴스 필드, 메소드
    int field1;
    void method1() {}

    //정적 필드, 메소드
    static int field2;
    static void method2() {}

    //인스턴스 멤버 클래스
    class B {
        void method() {
            //인스턴스 필드, 메소드
            field1 = 10;
            method1();

            //정적 필드, 메소드
            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            //인스턴스 필드, 메소드
            //정적 클래스는 바깥 객체 없이 사용 가능해야 하기 때문

            //field1 = 10; 오류
            //method1(); 오류

            //정적 필드, 메소드
            field2 = 10;
            method2();
        }
    }
}

public class java08 {
    public static void main(String[] args){

    }
}
