//로컬 클래스
class A6{
    void useB(){
        class B{
            int field1 = 1;

            static int field2 = 2;

            B(){
                System.out.println("B-method 생성자 실행");
            }

            void method1(){
                System.out.println("B-method1 실행");
            }

            static void method2(){
                System.out.println("B-method2 실행");
            }
        }

        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}

public class java06 {
    public static void main(String[] args){
        A6 a = new A6();
        a.useB();
    }
}
