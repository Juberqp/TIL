//매개변수 다형성
interface Vehicle{
    void run();
}

class Drive{
    void drive (Vehicle vehicle){
        vehicle.run();
    }
}

class Bus implements Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }
}

class Texi implements Vehicle{
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}

public class java09 {
    public static void main(String[] args){
        Drive d = new Drive();

        d.drive(new Bus());
        d.drive(new Texi());
    }
}
