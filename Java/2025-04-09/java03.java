//다형성
class Tire{
    //메소드
    public void roll(){
        System.out.println("회전합니다.");
    }
}

class HankookTire extends Tire{
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
}

class KumdoTire extends Tire{
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}

class Car{
    public Tire tire;

    public void run(){
        tire.roll();
    }
}

public class java03 {
    public static void main(String[] args){
        Car car = new Car();

        //일반 타이어
        car.tire = new Tire();
        car.run();

        //한국 타이어
        car.tire = new HankookTire();
        car.run();

        //금호 타이어
        car.tire = new KumdoTire();
        car.run();
    }
}
