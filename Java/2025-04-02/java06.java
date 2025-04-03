public class java06 {
    public static void main(String[] args){
        int apple = 1;
        double pice = 0.1;
        int number = 7;

        double r = apple - number*pice;
        System.out.println("남은 사과 조각 수: "+ r);

        int apple2 = 1;
        int pice2 = apple2*10;
        int number2 = 7;

        int r2 = pice2 - number2;
        System.out.println("남은 사과 조각 수: "+ r2);
        System.out.println("사과 1에서 남은 양: "+ r2/10.0);
    }
}
