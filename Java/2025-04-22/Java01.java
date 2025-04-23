//멀티 스레드
import java.awt.Toolkit;

public class Java01{
    public static void main(String[] args){
        Toolkit tk = Toolkit.getDefaultToolkit();

        for(int i=0; i<5; i++){
            tk.beep();
            try{
                Thread.sleep(500); //스레드 딜레이
            } catch (Exception e){}
        }

        for(int i=0; i<5; i++){
            System.out.println("띵!");
            try{
                Thread.sleep(500); //스레드 딜레이
            } catch (Exception e){}
        }
    }
}