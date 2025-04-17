//리플렉션
//패키지와 타입 정보 얻기
package com.example;

public class Java05 {
    public static void main(String[] args){
        //방법1
        Class clazz = Java01.class;

        //방법2
        //Class clazz2 = Class.forName("com.example.Java05");

        //방법3
        //Java05 j = new Java05();
        //Class clazz3 = j.getClass();

        System.out.println("패키지: "+clazz.getPackage().getName());
        System.out.println("클래스 간단 이름: "+clazz.getSimpleName());
        System.out.println("클래스 전체 이름: "+clazz.getName());
    }
}
