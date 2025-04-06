//static 지정
public class java05 {
    public static void main(String[] args){
        //calculator1 mycal = new calculator1();
        //static으로 지정하면 생성할 필요 X

        double r1 = 10 * 10 * calculator1.pi;
        int r2 = calculator1.plus(10, 5);
        int r3 = calculator1.minus(10, 5);

        System.out.println("r1: "+r1);
        System.out.println("r2: "+r2);
        System.out.println("r3: "+r3);
    }
}
