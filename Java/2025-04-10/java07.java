//강제 타입 변환
interface Vehicle{
    void run();
}

class Bus implements Vehicle {
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }

    //추가 메소드
    void checkFare(){
        System.out.println("승차요금을 체크합니다.");
    }
}

public class java07 {
    public static void main(String[] args){
        //업캐스팅
        Vehicle v = new Bus();
        v.run();

        //다운캐스팅
        Bus b = (Bus) v;
        b.run();
        b.checkFare();
    }
}
