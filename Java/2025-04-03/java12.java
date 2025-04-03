public class java12 {
    public static void main(String[] args){
        int sum = 0;
        int i;

        for(i=1; i<=100; i++){
            sum += i;
        }
        System.out.println("1~" + (i-1) + " 합 : "+sum);

        //float는 정확한 0.1 값이 아니기 때문에 오차가 발생
        for(float x=0; x<=1.0f; x+=0.1f){
            System.out.println(x);
        }
    }
}
