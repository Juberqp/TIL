class A3{
    //인스턴스 필드, 메서드는 A3객체가 있어야 가능
    //정적 필드, 메소드는 A3 없이 그냥 실행해도 됨.
    static class B {}

    //인스턴스
    B field1 = new B();

    //정적
    static B field2 = new B();

    A3(){
        B b = new B();
    }

    void method1(){
        B b = new B();
    }

    static void method2(){
        B b = new B();
    }
}

public class java03 {
    public static void main(String[] args){
        //static이라 A3와 별개
        A3.B b = new A3.B();
    }
}
