//바깥 객체 접근
class A9{
    //인스턴스
    String field = "A-field";

    void method(){
        System.out.println("A-method");
    }

    class B{
        //인스턴스
        String field = "B-field";

        void method(){
            System.out.println("B-method");
        }

        //메소드
        void print(){
            System.out.println(this.field);
            this.method();

            System.out.println(A9.this.field);
            A9.this.method();
        }
    }

    void useB(){
        B b = new B();
        b.print();
    }
}

public class java09 {
    public static void main(String[] args){
        A9 a = new A9();

        a.useB();
    }
}
