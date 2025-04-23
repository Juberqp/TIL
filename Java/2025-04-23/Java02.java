//wait() notfy()
//wait() : 난 잠
//notfy() : 다른 스레드 깨우기
//synchronized 에서만 가능
//그리고 무조건 같은 객체에서만 가능함

class WorkObject {
    public synchronized void methodA(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+": methodA 작업 실행");
        notify(); //다른 스레드 깨우기
        try{
            wait(); //실행 된 순간 멈춤
        } catch (InterruptedException e){
        }

        //깨워지면 wait 다음 부터 실행 됨
    }

    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+": methodB 작업 실행");
        notify(); //다른 스레드 깨우기
        try{
            wait(); //이 스레드 잠들기
        } catch (InterruptedException e){
        }
    }
}

class ThreadA extends Thread{
    private WorkObject wo;

    ThreadA(WorkObject wo){
        setName("ThreadA");
        this.wo = wo;
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            wo.methodA();
        }
    }
}

class ThreadB extends Thread{
    private WorkObject wo;

    ThreadB(WorkObject wo){
        setName("ThreadB");
        this.wo = wo;
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            wo.methodB();
        }
    }
}

public class Java02 {
    public static void main(String[] args){
        WorkObject wo = new WorkObject();

        ThreadA ta = new ThreadA(wo);
        ThreadB tb = new ThreadB(wo);

        ta.start();
        tb.start();
    }
}
