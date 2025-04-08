package test;

class Car{
    //자동차 정보
    final String brand;
    final String model;
    final int year;
    int mileage = 0;

    //자동차 개수
    static int carnum = 0;

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;

        carnum++;
    }

    //주행거리 증가
    void drive(int distance){
        mileage += distance;
    }

    //간 거리
    int getMileage(){
        return mileage;
    }

    //자동차 개수
    static int getTotalCars(){
        return carnum;
    }
}

class ElectricCar extends Car{
    int batteryCapacity;

    ElectricCar(String brand, String model, int year, int batteryCapacity){
        super(brand, model, year);
        if(batteryCapacity < 0) batteryCapacity = 0;
        else if(batteryCapacity > 100) batteryCapacity = 100;
        this.batteryCapacity = batteryCapacity; //상속 변수
    }

    //주행거리 증가, 오버라이딩
    @Override
    void drive(int distance){
        mileage += distance;
        batteryCapacity -= 10;
    }

    //남은 배터리
    int getBattery(){
        return batteryCapacity;
    }
}

public class test2{
    public static void main(String[] args){
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2023);
        ElectricCar eCar1 = new ElectricCar("Tesla", "Model 3", 2024, 100);

        car1.drive(100);
        eCar1.drive(50);

        System.out.println(car1.getMileage()); // 100
        System.out.println(eCar1.getMileage()); // 50
        System.out.println(eCar1.getBattery()); // 90 (주행하며 배터리 소모)

        System.out.println(Car.getTotalCars()); // 3 (총 생성된 자동차 개수)
    }
}