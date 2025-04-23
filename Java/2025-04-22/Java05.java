//Thread.sleep
//1/1000초 단위로 일시정지
import java.awt.Toolkit;

public class Java05 {
    public static void main(String[] args){
        Toolkit tk = Toolkit.getDefaultToolkit();

        for(int i=0; i<10; i++){
            tk.beep();
            System.out.println("삡!");
            try{
                Thread.sleep(200); //예외가 필요함
            } catch (InterruptedException e){
            }
        }
    }
}
