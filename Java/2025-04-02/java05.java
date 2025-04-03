public class java05 {
    public static void main(String[] args){
        byte v1 = 125;
        for(int i = 0; i < 5; i++){
            v1++;
            System.out.println("v1: "+v1);
        }

        System.out.println("-------------------------");

        byte v2 = -125;
        for(int i = 0; i < 5; i++){
            v2--;
            System.out.println("v2: "+v2);
        }
    }   
}
