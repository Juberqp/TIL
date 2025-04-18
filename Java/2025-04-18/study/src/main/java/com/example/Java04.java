//제네릭을 이용한 클래스 업캐스팅
package com.example;

class Sell <A, B>{
    private A kind;
    private B model;

    A getkind(){
        return kind;
    }
    B getmodel(){
        return model;
    }

    void setkind(A kind){
        this.kind = kind;
    }
    void setmodel(B model){
        this.model = model;
    }
}

class Tv{
}

class Car{
}

public class Java04 {
    public static void main(String[] args){
        Sell<Tv, String> s = new Sell<Tv, String>(); //직접 명시
        s.setkind(new Tv());
        s.setmodel("스마트 TV");

        //제네릭으로 타입이 Tv라는걸 알고 있어서 형변환 필요 없음
        Tv t = s.getkind();
        String tvmodel = s.getmodel();

        //----

        Sell<Car, String> s2 = new Sell<>(); //다이아몬드 연산자, 좌변 타입 보고 자동 추론
        s2.setkind(new Car());
        s2.setmodel("전기차");

        //제네릭으로 타입이 Car라는걸 알고 있어서 형변환 필요 없음
        Car c = s2.getkind();
        String carmodel = s2.getmodel();
    }
}
