//매개변수 다양성
class Vehicle{
    //메소드
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }
}

class Texi extends Vehicle{
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}

class Drive{
    //다형성 메소드
    public void drive(Vehicle vehicle){
        vehicle.run();
    }
}

public class java04 {
    public static void main(String[] args){
        Drive drive = new Drive();

        //다형성
        Bus bus = new Bus();
        drive.drive(bus);

        Texi texi = new Texi();
        drive.drive(texi);
    }
}
