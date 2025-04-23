//스레드 종료
//예전에는 stop을 이용해 종료함, 비정상적인 종료
//interrupt를 발생시키는 경우

class PrintThread2 extends Thread{
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("실행 중");
                Thread.sleep(1); //스레드가 자고 있을때 pt2.interrupt(); 받으면 catch

                /*
                또는
                if(Thread.interrupted()){
                    break;
                }
                */
            }
        }catch (InterruptedException e){}
        System.out.println("리소스 정리");
        System.out.println("종료");
    }
}

public class Java04 {
    public static void main(String[] args){
        PrintThread2 pt2 = new PrintThread2();

        pt2.start();

        try{
            Thread.sleep(500);
        } catch (InterruptedException e){}

        pt2.interrupt(); //스레드 깨우는 역할
    }
}
