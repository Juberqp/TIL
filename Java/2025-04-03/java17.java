import java.util.Scanner;

public class java17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하시려면 q를 입력하세요.");

        String inputstring;

        do {
            System.out.print(">");
            inputstring = scanner.nextLine();
            System.out.println(inputstring);
        } while(! inputstring.equals("q"));

        
    }
}
