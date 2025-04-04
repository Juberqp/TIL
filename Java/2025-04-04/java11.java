public class java11 {
    public static void main(String[] args){
        String a[] = new String[3];
        a[0] = "java";
        a[1] = "java";
        a[2] = new String("java");

        //문자는 전부 일치하지만 가르키는 주소지가 다르다.
        System.out.println(a[0] == a[1]);
        System.out.println(a[1] == a[2]);
        System.out.println(a[0].equals(a[2]));
    }
}
