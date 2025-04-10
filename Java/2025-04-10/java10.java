//객체 타입 확인
interface Vehicle2{
    void run();
}

class Bus2 implements Vehicle2{
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }

    public void checkFare(){
        System.out.println("승차 요금을 확인합니다.");
    }
}

class Texi2 implements Vehicle2{
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}

public class java10 {
    public static void main(String[] args){
        Texi2 texi = new Texi2();
        Bus2 bus = new Bus2();

        ride(texi);
        ride(bus);
    }

    public static void ride(Vehicle2 v){
        if (v instanceof Bus2 bus){
            bus.checkFare();
        }

        v.run();
    }
}
