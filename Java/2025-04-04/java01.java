public class java01 {
    public static void main(String[] args){
        int[] a1;
        int[] a2;
        int[] a3;

        a1 = new int[] {1, 2, 3};
        a2 = new int[] {1, 2, 3};
        a3 = a2;

        System.out.println(a1 == a2);
        System.out.println(a2 == a3);
    }
}