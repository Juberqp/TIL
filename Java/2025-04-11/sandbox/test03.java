package sandbox;

abstract class Vehicle{
    String name;

    Vehicle(String name){
        this.name = name;
    }

    //추상
    abstract void startEngine();

    void stopEngine(){
        System.out.println("차량 시동을 끕니다.");
    }
}

interface Fuelable{
    void refuel();
}

class Car extends Vehicle implements Fuelable{
    Car(String name){
        super(name);
    }
    @Override
    void startEngine(){
        System.out.println(name+" 시동을 겁니다.");
    }
    @Override
    public void refuel(){
        System.out.println(name+"에 연료를 주입합니다.");
    }
}

class Motorcycle extends Vehicle implements Fuelable{
    Motorcycle(String name){
        super(name);
    }
    @Override
    void startEngine(){
        System.out.println(name+" 시동을 겁니다.");
    }
    @Override
    public void refuel(){
        System.out.println(name+"에 연료를 주입합니다.");
    }
}

public class test03 {
    public static void main(String[] args){
        Car car = new Car("자동차");
        Motorcycle moto = new Motorcycle("오토바이");

        Vehicle[] v = { car, moto };
        Fuelable[] f = { car, moto };
        
        for(Vehicle i : v){
            i.startEngine();
            i.stopEngine();
        }

        for(Fuelable i : f){
            i.refuel();
        }
    }
}
