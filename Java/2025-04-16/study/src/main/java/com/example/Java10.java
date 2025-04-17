//포장 클래스
//기본 타입의 객체형
//String 처럼 객체를 생성해서 힙 번지를 받음
package com.example;

public class Java10 {
    public static void main(String[] args){
        //Boxing
        Integer obj = 100;
        //포장 클래스 값 반환 intValue() / 최신 버전은 그냥 출력됨
        System.out.println("value: "+obj.intValue());
        System.out.println("value: "+obj);

        //Unboxing
        int value = obj;
        System.out.println("value: "+value);

        //연산 시 unboxing
        int result = obj + 100;
        System.out.println("result: "+result);

        //주의
        //Integer a = null;
        //int b = a; ❌ 여기서 NPE 터짐!
    }
    
}
