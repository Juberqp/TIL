package test;

abstract class Vehicle{
    //필드
    int speed;

    Vehicle(int speed){
        this.speed = speed;
    }

    abstract void move();

    void stop(){
        System.out.println("차량이 정지합니다.");
    }
}

class Car extends Vehicle{
    Car(int speed){
        super(speed);
    }

    void move(){
        System.out.println("자동차가 시속 "+speed+"km로 달립니다.");
    }
}

class Bicycle extends Vehicle{
    Bicycle(int speed){
        super(speed);
    }

    void move(){
        System.out.println("자전거가 시속 "+speed+"km로 달립니다.");
    }
}

public class test03 {
    public static void main(String[] args){
        Car c = new Car(100);
        Bicycle b = new Bicycle(20);

        c.move();
        c.stop();

        b.move();
        b.stop();
    }
}
