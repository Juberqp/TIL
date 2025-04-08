package test;

class Car{
    String brand;
    String model;
    int year;
    int mileage;

    boolean isRented;

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //운전
    void drive(int distance){
        if(isRented == true) {
            if(distance < 0) distance = 0;
            mileage += distance;
        } else {
            System.out.println("빌려간 상태일 때만 주행 가능합니다");
        }
    }

    //대여
    void rent(){
        if(isRented == true) System.out.println("이미 대여 중이면 빌릴 수 없습니다.");
        else isRented = true;
    }

    //반납
    void returnCar(){
        if(isRented == false) System.out.println("대여 중인 차량만 반납 가능합니다.");
        else isRented = false;
    }
}

class ElectricCar extends Car{
    private int batteryCapacity;

    ElectricCar(String brand, String model, int year, int batteryCapacity){
        super(brand, model, year);
        if(batteryCapacity < 0) batteryCapacity = 0;
        else if(batteryCapacity > 100) batteryCapacity = 0;
        this.batteryCapacity = batteryCapacity;
    }

    //운전
    @Override
    void drive(int distance){
        if(isRented == true) {
            if(distance < 0) distance = 0;
            mileage += distance;
            batteryCapacity -= 10;
        } else if(batteryCapacity <= 0) {
            System.out.println("배터리가 0이면 주행 불가합니다");
        } else {
            System.out.println("빌려간 상태일 때만 주행 가능합니다");
        }
    }
}

public class test3 {
    public static void main(String[] args){
        CarRentalService service = CarRentalService.getInstance();

        Car car1 = new Car("Toyota", "Camry", 2022);
        ElectricCar eCar1 = new ElectricCar("Tesla", "Model 3", 2024, 100);

        service.addCar(car1);
        service.addCar(eCar1);

        service.rentCar("Camry"); // "Camry 대여 완료!"
        service.rentCar("Camry"); // "Camry는 이미 대여 중입니다."

        car1.drive(50); // 가능
        eCar1.drive(30); // 가능, 배터리 감소

        service.returnCar("Camry"); // "Camry 반납 완료!"
    }
}
