public class java01{
    public static void main(String[] args){
        int x = 5;
        double y = 0.0;
        double z = x / y;

        //double z = x % y; 5 % 0 연산은 잘못됨
    
        System.out.println(z + 2);

        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가.");
        } else {
            System.out.println(z + 2);
        }
    }
}