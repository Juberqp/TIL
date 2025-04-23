//스레드 종료
//예전에는 stop을 이용해 종료함, 비정상적인 종료
//로직을 만드는 경우

class PrintThread extends Thread{
    private boolean stop;

    void setStop(boolean stop){
        this.stop = stop;
    }

    @Override
    public void run(){
        while(!stop){
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("종료");
    }
}

public class Java03 {
    public static void main(String[] args){
        PrintThread pt = new PrintThread();

        pt.start();
        try{
            Thread.sleep(500);
        } catch (InterruptedException e){}
        pt.setStop(true); //종료됨
    }
}
