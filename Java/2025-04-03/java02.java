public class java02 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 10;
        boolean r1 = (num1 == num2);
        boolean r2 = (num1 != num2);
        boolean r3 = (num1 <= num2);

        System.out.println("r1: "+r1);
        System.out.println("r2: "+r2);
        System.out.println("r3: "+r3);

        char a = 'A';
        char b = 'B';
        boolean r4 = (a < b);
        System.out.println("r4: "+r4);

        int num3 = 1;
        double num4 = 1.0;
        boolean r5 = (num3 == num4);
        System.out.println("r5: "+r5);

        float num5 = 0.1f;
        double num6 = 0.1f;
        boolean r6 = (num5 == num6);
        boolean r7 = (num5 == (float)num6);
        System.out.println("r6: "+r6);
        System.out.println("r7: "+r7);

        String str1 = "자바";
        String str2 = "Java";
        boolean r8 = (str1.equals(str2));
        boolean r9 = (! str1.equals(str2));
        System.out.println("r8: "+r8);
        System.out.println("r9: "+r9);

    }
}
