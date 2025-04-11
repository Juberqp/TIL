//중첩 클래스
class A{
    class B{}

    B field = new B();

    A(){
        B b = new B();
    }

    void method(){
        B b = new B();
    }
}

public class java01 {
    public static void main(String[] args){
        //A 객체 인스턴스 선언+생성 -> B 객체 인스턴스 선언+생성됨

        //종속됨
        A a = new A();
        A.B b = a.new B();
    }
}
