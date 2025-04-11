//로컬 클래스와 로컬 변수
class A7{
    void method(){
        int a = 10; // 로컬 클래스에선 final 취급

        class B{
            void print(){
                System.out.println(a);
                //a = 20; 로컬 클래스에서는 로컬 변수가 final 된다.
            }
        }

        B b = new B();
        b.print();
    }
}

public class java07 {
    public static void main(String[] args){
        A7 a = new A7();
        //로컬 클래스는 오직 선언된 메서드 안에서만 생성 가능
        a.method();
    }
}
