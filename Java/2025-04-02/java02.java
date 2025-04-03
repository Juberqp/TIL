import java.util.Scanner;

public class java02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strx = scanner.nextLine();
        int x = Integer.parseInt(strx);

        System.out.print("y 값 입력: ");
        String stry = scanner.nextLine();
        int y = Integer.parseInt(stry);

        int r = x+y;
        System.out.println("x + y = "+r);
        System.out.println();

        while(true){
            System.out.printf("입력 문자열");
            String data = scanner.nextLine();

            if (data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: "+data);
            System.out.println();
        }

        scanner.close();
    }
}
