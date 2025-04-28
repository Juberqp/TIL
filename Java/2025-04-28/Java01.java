//매개변수 람다식
//인터페이스를 람다로 사용

@FunctionalInterface //추상 메소드가 단 1개인지 체크
interface Calculable{
    void calculate(int x, int y);
}

public class Java01{
    public static void main(String[] args){
        action((x, y) ->{
            int r = x + y;
            System.out.println("result: "+r);
        });

        action((x, y) ->{
            int r = x - y;
            System.out.println("result: "+r);
        });
    }

    //Calculable calculable 이곳에 구현한 람다식이 들어감
    public static void action(Calculable calculable){
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}