//봉인된 인터페이스

sealed interface InterfaceA permits InterfaceB{
    void methodA();
}

non-sealed interface InterfaceB extends InterfaceA{
    void methodB();
}

interface InterfaceC extends InterfaceB{
    void methodC();    
}

class Implclass implements InterfaceC{
    public void methodA(){
        System.out.println("A 실행");
    }

    public void methodB(){
        System.out.println("B 실행");
    }

    public void methodC(){
        System.out.println("C 실행");
    }   
}

public class java11 {
    public static void main(String[] args){
        Implclass impl = new Implclass();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodA();
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
