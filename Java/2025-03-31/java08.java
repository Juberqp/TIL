public class java08 {
    public static void main(String[] args){
        boolean stop = true;

        if(stop){
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean r1 = (x == 20);
        boolean r2 = (x == 10);
        System.out.println("r1: "+r1);
        System.out.println("r2: "+r2);
    }
}
