//타입 변환
interface A{
}

class B implements A{

}

class C implements A{

}

class D extends B{

}

class E extends C{

}

public class java06 {
    public static void main(String[] args){
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        //인터페이스 변수 선언
        A a;

        //인터페이스를 구현한 클래스를 상속 받아도 인터페이스의 타입이 될 수 있다.
        a = b;
        a = c;
        a = d;
        a = e;
    }
}
