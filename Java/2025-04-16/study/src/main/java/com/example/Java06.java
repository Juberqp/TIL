//시스템 프로퍼티 읽기
//자바 시스템 시작시 자동 설정되는 시스템 속성
package com.example;

import java.util.Properties;
import java.util.Set;

public class Java06 {
    public static void main(String[] args){
        //운영체제와 사용자 정보 출력
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println(osName);
        System.out.println(userName);
        System.out.println(userHome);

        //전체 키값 출력
        System.out.println("-----------------------");
        System.out.println("key:      value:");
        System.out.println("-----------------------");
        
        //정적 메소드 호출
        Properties props = System.getProperties(); //시스템 프로퍼티 객체
        Set keys = props.keySet(); //키 목록 전부 가져옴

        for(Object objkey : keys){
            String key = (String) objkey; //String 변환
            String value = System.getProperty(key); //키 값 가져오기
            System.out.printf("%-40s: %s\n", key, value);
        }
    }   
}
