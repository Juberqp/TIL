public class java02 {
    //java java03.java 10 20
    //args 이용 방법
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("입력값 부족");
            System.exit(0);
        }

        String str1 = args[0];
        String str2 = args[1];

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int r = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+r);
    }
}
