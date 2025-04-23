//스레드 사용 01
import java.awt.Toolkit;

public class Java02 {
    public static void main(String[] args){
        //익명 클래스로 스레드 실행
        Thread thread = new Thread(new Runnable() {
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
        });

        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("띵!");
            try{
                Thread.sleep(500); //스레드 딜레이
            } catch (Exception e){}
        }
    }
}
