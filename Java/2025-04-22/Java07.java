//yield
//다른 스레드에게 양보

class WorkThread extends Thread{
    public boolean work = true;

    public WorkThread(String name){
        setName(name);
    }

    @Override
    public void run(){
        while(true){
            if(work){
                System.out.println(getName()+": 작업 처리");
            } else {
                Thread.yield();
            }
        }
    }
}

public class Java07 {
    public static void main(String[] args){
        WorkThread wtA = new WorkThread("스레드A");
        WorkThread wtB = new WorkThread("스레드B");

        wtA.start();
        wtB.start();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
        }
        wtA.work = false;

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
        }
        wtA.work = true;
    }
}
