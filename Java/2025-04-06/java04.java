//메소드 오버로딩
//메소드 이름은 같지만 타입, 개수, 순서가 다르게 중복 선언
public class java04 {
    public static void main(String[] args){
        calculator mycal = new calculator();

        //정사각형
        double r1 = mycal.rectangle(10);

        //직사각형
        double r2 = mycal.rectangle(10, 20);

        System.out.println("정사각형의 넓이: "+r1);
        System.out.println("직사각형의 넓이: "+r2);
    }
}
