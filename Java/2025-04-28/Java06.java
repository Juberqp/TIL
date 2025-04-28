//메소드 참조 람다식
//정적 메소드와 인스턴스 메소드 참조
//고급 단계

@FunctionalInterface
interface Calcuable2{
    double calc(double x, double y);
}

class Person4{
    void action(Calcuable2 calc){
        double r = calc.calc(10, 4);
        System.out.println("결과: "+r);
    }
}

class Computer{
    static double staticMethod(double x, double y){
        return x+y;
    }

    double instanceMethod(double x, double y){
        return x*y;
    }
}

public class Java06 {
    public static void main(String[] args){
        Person4 person = new Person4();

        //static
        person.action(Computer :: staticMethod);

        //인스턴스
        Computer com = new Computer();
        person.action(com :: instanceMethod);
    }
}
