//리턴값이 있는 람다식

@FunctionalInterface
interface Calcuable{
    double calc(double x, double y);
}

class Person3{
    void action(Calcuable calcuable){
        double r = calcuable.calc(10, 4);
        System.out.println("결과: "+r);
    }
}

public class Java05 {
    public static double sum(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        Person3 person = new Person3();

        person.action((x, y) ->{
            double r = x + y;
            return r;
        });

        //리턴문이 1개 있을 시 return 생략
        person.action((x, y) -> (x + y));

        //리턴문이 1개 있을 시 메소드 호출 후 리턴
        person.action((x, y) -> sum(x, y));
    }
}
