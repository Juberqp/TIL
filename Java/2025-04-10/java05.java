//다중 상속
interface InterfaceA{
    void methodA();
}

interface InterfaceB{
    void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB{
    void methodC();
}

class InterfaceCImpl implements InterfaceA, InterfaceB, InterfaceC{
    public void methodA(){
        System.out.println("methodA()");
    }
    public void methodB(){
        System.out.println("methodB()");
    }
    public void methodC(){
        System.out.println("methodC()");
    }
}

public class java05 {
    public static void main(String[] args){
        InterfaceA ia = new InterfaceCImpl();
        ia.methodA();
        //ia.methodB(); //상속 안됨
        System.out.println();

        InterfaceB ib = new InterfaceCImpl();
        //ib.methodA(); //상속 안됨
        ib.methodB();
        System.out.println();

        InterfaceC ic = new InterfaceCImpl();
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
