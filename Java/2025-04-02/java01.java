public class java01{
    public static void main(String[] args){
        int val = 123;

        System.out.printf("상품의 가격 %d원\n", val);
        System.out.printf("상품의 가격 %6d원\n", val);
        System.out.printf("상품의 가격 %-6d원\n", val);
        System.out.printf("상품의 가격 %06d원\n", val);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지음이 %d인 원의 넓이: %10.2f\n", 10, area);

        String name = "홍길동";
        String job = "로그";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}