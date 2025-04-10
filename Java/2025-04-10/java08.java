//인터페이스 다형성
interface Tire{
    //추상 메서드
    void roll();
}

class HankookTire implements Tire{
    @Override
    public void roll(){
        System.out.println("한국 타이어 굴러간다.");
    }
}

class KumhoTire implements Tire{
    @Override
    public void roll(){
        System.out.println("금호 타이어 굴러간다.");
    }
}

class Car{
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}

public class java08 {
    public static void main(String[] args){
        Car mycar = new Car();

        mycar.run();

        mycar.tire1 = new KumhoTire();
        mycar.tire2 = new KumhoTire();

        mycar.run();
    }
}
