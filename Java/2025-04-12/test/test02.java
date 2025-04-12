/*
🚗 문제: Car 클래스 안에 static 멤버 클래스인 Engine 만들기

구현 내용:

클래스 이름: Car

내부 클래스: static class Engine

Engine 클래스에 start() 메서드 만들기

출력: 엔진이 켜졌습니다
*/

package test;

class Car{
    static class Engine{
        void start(){
            System.out.println("엔진이 켜졌습니다");
        }
    }
}

public class test02 {
    public static void main(String[] args){
        Car.Engine engine = new Car.Engine();
        engine.start();
    }
}
