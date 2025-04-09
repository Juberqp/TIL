//강제 타입 변환
class Parent2{
    //필드 선언
    public String field1;

    //메소드 선언
    public void method1(){
        System.out.println("Parent-method1");
    }

    public void method2(){
        System.out.println("Parent-method2");
    }
}

class Child2 extends Parent2{
    //필드
    public String field2;

    //메소드
    public void method3(){
        System.out.println("Child-method3");
    }
}

public class java02 {
    public static void main(String[] args){
        Parent2 parent = new Child2(); //업캐스팅
    
        //Parent로 사용중 //자식 필드나 메소드 사용 불가
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        //다운캐스팅
        Child2 child = (Child2) parent;
        child.field2 = "data2";
        child.method3();
    }
}