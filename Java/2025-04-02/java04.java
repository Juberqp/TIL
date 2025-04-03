public class java04 {
    public static void main(String[] args){
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10;

        int r1 = v1 + v2;
        System.out.println("r1: "+r1);

        long r2 = v1 + v2 - v4;
        System.out.println("r2: "+r2);

        double r3 = (double) v1 / v2;
        System.out.println("r3: "+r3);
        
        int r4 = v1 % v2;
        System.out.println("r4: "+r4);
    }
}
