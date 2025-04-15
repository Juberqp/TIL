//예외 떠넘기기
package com.example;

public class Java02{
    //main에 throws Exception 작성 시 최종적으로 모든 에러를 JVM이 처리
    public static void main(String[] args) throws Exception{
        findClass();
    }

    //클래스 없음 예외 발생시
    public static void findClass() throws ClassNotFoundException{
        Class.forName("Java99");
    }
}