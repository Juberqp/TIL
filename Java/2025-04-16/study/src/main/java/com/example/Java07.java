//String 클래스
//문자열 변수를 저장하거나 조작할때 사용
package com.example;

import java.util.Arrays;

//예외용, java.lang 패키지의 예외만 자동 import 되기 때문
import java.io.UnsupportedEncodingException;

public class Java07 {
    public static void main(String[] args){
        String data = "자바";

        //String -> byte (기본 UTF-8)
        byte[] arr1 = data.getBytes(); //byte[] arr1 = data.getBytes("UTF-8");
        System.out.println("arr1: "+Arrays.toString(arr1)); //배열 출력

        //byte -> String (기본 UTF-8)
        String str1 = new String(arr1); //String class에 저장된 메소드
        System.out.println(str1);

        //String -> byte (EUC-KR 인코딩)
        try{
            byte[] arr2 = data.getBytes("EUC-KR"); //예외가 발생할 수 있어 try로 감쌈
            System.out.println("arr2: "+Arrays.toString(arr2));

            //byte -> String (EUC-KR 인코딩)
            String str2 = new String(arr2, "EUC-KR"); //예외가 발생할 수 있어 try로 감쌈
            System.out.println("str2: "+str2);
        } catch (UnsupportedEncodingException e){
            System.out.println("에러: "+e);
        }
    }
}
