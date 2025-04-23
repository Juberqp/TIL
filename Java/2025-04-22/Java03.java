//스레드 사용 02
import java.awt.Toolkit;

//Runnable는 인터페이스
class myRunnable implements Runnable{
    myRunnable(){
        run();
    }

    @Override
    public void run(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            tk.beep();
            try{
                Thread.sleep(500);
            } catch (Exception e){
            }
        }
    }
}

public class Java03 {
    public static void main(String[] args){
        //클래스로 스레드 실행
        Thread thread = new Thread(new myRunnable());

        thread.start();
        
        for(int i=0; i<5; i++){
            System.out.println("띵!");
            try{
                Thread.sleep(500); //스레드 딜레이
            } catch (Exception e){}
        }
    }
}
