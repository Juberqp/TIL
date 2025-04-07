package 챕터6문제풀이;

import java.util.Scanner;

public class j20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Account2[] bankapplication = new Account2[100]; //미리 100개 만듬
        int bank_num = 0;

        String check = "";
        while(!check.equals("5")){
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택>");
            check = scanner.nextLine();

            if(check.equals("1")){
                System.out.println("-------");
                System.out.println("계좌생성");
                System.out.println("-------");

                System.out.print("계좌번호: ");
                String num = scanner.nextLine();
                System.out.print("계좌주: ");
                String name = scanner.nextLine();
                System.out.print("초기입금액: ");
                String m = scanner.nextLine();
                int money = Integer.parseInt(m);

                bankapplication[bank_num] = new Account2(num, name, money);
                bank_num++;

            } else if (check.equals("2")){
                System.out.println("-------");
                System.out.println("계좌목록");
                System.out.println("-------");
                for(int i=0; i<bank_num; i++){
                    System.out.println(bankapplication[i].num +"     "+ bankapplication[i].name +"     "+ bankapplication[i].money);
                }

            } else if (check.equals("3")){
                System.out.println("-------");
                System.out.println("예금");
                System.out.println("-------");
                System.out.print("계좌번호: ");
                String num = scanner.nextLine();
                for(int i=0; i<bank_num; i++){
                    if(num.equals(bankapplication[i].num)){
                        System.out.print("예금액: ");
                        String m = scanner.nextLine();
                        bankapplication[i].in(Integer.parseInt(m));
                    }
                }
            } else if (check.equals("4")){
                System.out.println("-------");
                System.out.println("출금");
                System.out.println("-------");
                System.out.print("계좌번호: ");
                String num = scanner.nextLine();
                for(int i=0; i<bank_num; i++){
                    if(num.equals(bankapplication[i].num)){
                        System.out.print("출금액: ");
                        String m = scanner.nextLine();
                        bankapplication[i].out(Integer.parseInt(m));
                    }
                }
            }
        }

        System.out.println("시스템 종료.");
    }
}
