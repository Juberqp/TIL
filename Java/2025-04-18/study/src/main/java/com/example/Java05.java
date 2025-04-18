package com.example;

interface Rentable<P>{
    P rent();
}

class Home{
    void turnOnLight(){
        System.out.println("전등을 켭니다.");
    }
}

class Cart{
    void run(){
        System.out.println("자동차가 달립니다.");
    }
}

//제네릭 인터페이스 상속
class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent(){
        return new Home();
    }
}

//제네릭 인터페이스 상속
class CarAgency implements Rentable<Cart>{
    @Override
    public Cart rent(){
        return new Cart();
    }
}

public class Java05 {
    public static void main(String[] args){
        HomeAgency home = new HomeAgency();
        CarAgency car = new CarAgency();

        //클래스 리턴 받음
        Home h = home.rent();
        Cart c = car.rent();

        h.turnOnLight();
        c.run();
    }
}
