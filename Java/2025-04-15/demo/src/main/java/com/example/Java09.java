//레코드 선언
//반복되는 코드를 줄이기 위함
package com.example;

record Member2(String id, String name, int age){
    //자동으로 getter/setter, toString, hashCode, equals 제공
    //final 취급이라 수정은 안됨
    //원하는 출력을 하려면 오버라이딩 해야한다.
}

public class Java09 {
    public static void main(String[] args){
        Member2 m = new Member2("winter", "눈송이", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Member2 m1 = new Member2("winter", "눈송이", 25);
        Member2 m2 = new Member2("winter", "눈송이", 25);
        System.out.println("m1.hashCode(): "+m1.hashCode());
        System.out.println("m1.hashCode(): "+m2.hashCode());
        System.out.println("m1.hashCode(): "+m1.equals(m2));
    }
    
}
