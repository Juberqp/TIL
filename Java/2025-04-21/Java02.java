//제한된 타입 파라미터
//타입 제한
public class Java02 {
    public static <T extends Number> boolean compare(T t1, T t2){
        //T 타입 출력
        System.out.println("compare("+t1.getClass().getSimpleName()+", "+t2.getClass().getSimpleName());

        //Number 클래스 사용
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args){
        boolean r1 = compare(10, 20);
        System.out.println(r1);
        System.out.println();

        boolean r2 = compare(4.5, 4.5);
        System.out.println(r2);
    }
}
