//class 타입 변환
class Parent{
    //메소드
    public void method1(){
        System.out.println("Parent-method1()");
    }

    public void method2(){
        System.out.println("Parent-method2()");
    }
}

class Child extends Parent{
    //메소드 오버라이딩
    @Override
    public void method2(){
        System.out.println("Child-method2()");
    }

    public void method3(){
        System.out.println("Child-method3()");
    }
}

public class java01 {
    public static void main(String[] args){
        Child child = new Child();

        //타입 변환
        Parent parent = child;

        //호출
        parent.method1();
        parent.method2();
        //parent.method3(); 불가능


    }
}