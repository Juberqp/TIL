//연습문제
class Printer{
    void print(String doc){
        try { Thread.sleep(100); } catch(InterruptedException e) {}
        System.out.print("[" + Thread.currentThread().getName());
        System.out.print("] 문서 출");
        System.out.print("력: ");
        System.out.println(doc);
    }
}

class Pta extends Thread{
    Printer printer;

    Pta(Printer printer){
        this.printer = printer;
    }

    @Override
    public void run(){
        for(int i=1; i<100; i++)
            printer.print("[" + Thread.currentThread().getName() + "] 문서A-" + i);
    }
}

class Ptb extends Thread{
    Printer printer;

    Ptb(Printer printer){
        this.printer = printer;
    }

    @Override
    public void run(){
        for(int i=1; i<100; i++)
            printer.print("[" + Thread.currentThread().getName() + "] 문서B-" + i);
    }
}

public class Test02 {
    public static void main(String[] args){
        Printer p = new Printer();

        Pta a = new Pta(p);
        Ptb b = new Ptb(p);

        a.start();
        b.start();
    }
}
