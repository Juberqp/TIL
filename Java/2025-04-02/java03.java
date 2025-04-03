public class java03 {
    public static void main(String[] args){
        int x = -100;
        x = -x;

        System.out.println("x: "+x);

        byte b = 100;
        int y = -b;
        System.out.println("y: "+y);

        x = 1;
        y = 1;
        int r1 = ++x + 10;
        int r2 = y++ + 10;

        System.out.println("r1: "+r1);
        System.out.println("r2: "+r2);
    }
}
