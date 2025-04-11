//중첩 클래스의 static
class A4{
    static class B{
        int field1 = 1;

        //java 17 부터 허용
        static int field2 = 2;

        B(){
            System.out.println("B-생성자 실행");
        }

        void method1(){
            System.out.println("B-메서드1 실행");
        }

        //java 17 부터 허용
        static void method2(){
            System.out.println("B-메서드2 실행");
        }
    }
}

public class java04 {
    public static void main(String[] args){
        //인스턴스
        A4.B b = new A4.B();
        System.out.println(b.field1);
        b.method1();

        //static
        System.out.println(A4.B.field2);
        A4.B.method2();
    }
}
