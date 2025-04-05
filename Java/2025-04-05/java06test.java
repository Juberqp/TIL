import java.util.Scanner;

public class java06test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("1.학생수 | 2.점수확인 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("----------------------------------------------------");

        int check = 0;
        int s = 0; //학생
        int[] score = null;

        int h = 0;
        int sum = 0;
        while(check != 5){
            System.out.print("선택> ");
            check = scanner.nextInt();

            if(check == 1){
                System.out.print("학생 수> ");
                s = scanner.nextInt();
                score = new int[s];
            } else if(check == 2){
                for(int i=0; i<s; i++){
                    System.out.print("score["+i+"]> ");
                    score[i] = scanner.nextInt();
                }
            } else if(check == 3){
                for(int i=0; i<s; i++){
                    System.out.println("score["+i+"]: "+score[i]);
                }
            } else if(check == 4){
                for(int i : score){
                    sum += i;
                    if(h < i) h = i;
                }
                System.out.println("최고 점수: "+h);
                Double avg = (double) sum / score.length;
                System.out.println("평균 점수: "+avg);
            }
        }
        System.out.println("프로그램 종료");
    }
}
