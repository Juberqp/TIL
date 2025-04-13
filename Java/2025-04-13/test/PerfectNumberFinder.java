import java.util.Scanner;

public class PerfectNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력: ");
        int input = scanner.nextInt();

        if (input < 1) {
            System.out.println("1 이상의 정수를 입력해주세요.");
            return; // 프로그램 종료
        }

        for (int num = 1; num <= input; num++) {
            int sum = 0;
            String divisors = "";

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    // 문자열 연결
                    if (!divisors.isEmpty()) {
                        divisors += " + ";
                    }
                    divisors += i;
                }
            }

            if (sum == num) {
                System.out.println(num + "은(는) 완전수입니다. 약수: " + divisors);
            }
        }
    }
}
