//콘솔 출력
//java.lang 패키지의 System 클래스를 이용하여 운영체제에 콘솔 접근
package com.example;

public class Java02 {
    public static void main(String[] args){
        try{
            int value = Integer.parseInt("1oo");
        } catch (NumberFormatException e){
            //System.out 도 java.lang 패키지의 System 클래스안 메소드
            System.out.println("[에러 내용]");
            System.out.println(e.getMessage());
        }
    }
}
