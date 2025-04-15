//예외 떠넘기기
package com.example;

public class Java01{
    public static void main(String[] args){
        try{
            findClass();
        } catch (ClassNotFoundException e){
            System.out.println("예외 처리: "+e.toString());
        }
    }

    //클래스 없음 예외 발생시
    public static void findClass() throws ClassNotFoundException{
        Class.forName("Java99");
    }
}