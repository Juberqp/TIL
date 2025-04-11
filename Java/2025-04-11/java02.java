//인스턴스 멤버 클래스
class A2{
    class B2{
        int field1 = 1;

        static int field2 = 2;

        B2(){
            System.out.println("B 생성자 실행.");
        }

        void method1(){
            System.out.println("B-method1 실행");
        }

        static void method2(){
            System.out.println("B-method2 실행");
        }
    }

    void useB2(){
        B2 b = new B2();
        System.out.println(b.field1);
        b.method1();

        System.out.println(b.field2);
        b.method2();
    }
}

public class java02 {
    public static void main(String[] args){
        A2 a = new A2();
        a.useB2();
    }
}
