//문자열을 기본 타입 값으로 변환
//보통 객체가 생성되면 번지가 다를 수 있기 때문에 equals 를 사용
//포장 클래스에서 Override 된 equals를 사용할 수 있다.

/*
효율을 위해 boolean, char, byte,short, int 객체는 공유됨
하지만 안전을 위해 equals 사용 권장
*/

package com.example;

public class Java11 {
    public static void main(String[] args){
        //범위가 -128~127인 이유는 초창기 자바 설계자들이 성능과 메모리 절약을 위해 정한 값

        //-128~127 초과일 경우
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("== : "+(obj1==obj2));
        System.out.println("equals : "+obj1.equals(obj2));
        System.out.println();

        //-128~127 범위 값일때
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("== : "+(obj3==obj4));
        System.out.println("equals : "+obj3.equals(obj4));
        System.out.println();
    }
}
