//로컬 클래스
class A5{
    //생성자
    A5(){
        class B {}
        B b = new B();
    } //b 소멸

    void method(){
        class B {}
        B b = new B();
    } //b 소멸
}

public class java05 {
    public static void main(String[] args){

    }
}
