import java.util.Scanner;

public class java16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while(run){
            System.out.println("------------------------");
            System.out.println("1 중속 | 2 감속 | 3 중지");
            System.out.println("------------------------");
            System.out.println("입력: ");

            String strnum = scanner.nextLine();

            if(strnum.equals("1")){
                speed++;
                System.out.println("현재 속도: "+speed);
            } else if (strnum.equals("2")){
                speed--;
                System.out.println("현재 속도: "+speed);
            } else if (strnum.equals("3")){
                run = false;
            }
        }

        System.out.println("시스템 종료");
    }
}
