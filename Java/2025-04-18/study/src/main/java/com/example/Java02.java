//제네릭
//타입 안정성을 위한 기능

package com.example;

//제네릭 선언
class Box <T>{
    //어떤 값이든 넣을 수 있음
    private T box; //변환하면 Object box;

    //setter
    void s(T box){
        this.box = box;
    }

    //getter
    T g(){
        return box;
    }
}

public class Java02 {
    public static void main(String[] args){
        Box<String> box1 = new Box<String>();
        box1.s("문자");
        System.out.println("값: "+box1.g());

        Box<Integer> box2 = new Box<Integer>();
        box2.s(123);
        System.out.println("값: "+box2.g());

    }
}
