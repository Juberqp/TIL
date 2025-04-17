//StringTokenizer 클래스
//문자열이 구분자로 나뉘었을때

//요즘 거의 안씀 / 공식 문서도 split 권장
package com.example;

import java.util.StringTokenizer;

public class Java09 {
    public static void main(String[] args){
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");
        for(String token : arr){
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
