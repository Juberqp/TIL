//메소드 호출
public class java01{
    public static void main(String[] args){
        calculator mycalc = new calculator();

        //리턴 없음
        mycalc.poweron();

        //리턴 있음
        int r1 = mycalc.plus(5, 6);
        System.out.println("r: "+r1);

        int x = 10;
        int y = 4;
        double r2 = mycalc.divide(x, y);
        System.out.println("r2: "+r2);

        //리턴 없음
        mycalc.poweroff();
    }
}