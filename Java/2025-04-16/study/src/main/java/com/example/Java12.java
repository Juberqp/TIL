//수학 클래스
//정적 클래스이기 때문에 바로 사용 가능
package com.example;

public class Java12 {
    public static void main(String[] args){
        //큰 정수 또는 작은 정수 얻기 / 반올림
        double v1 = Math.ceil(5.3); 
        double v2 = Math.floor(5.3);
        System.out.println("v1: "+v1);
        System.out.println("v2: "+v2);

        //큰값 또는 작은값
        long v3 = Math.max(3, 7);
        long v4 = Math.min(3, 7);
        System.out.println("v3: "+v3);
        System.out.println("v4: "+v4);

        //소수 이하 2자리 얻기
        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);

        double v5 = temp2 / 100.0;
        System.out.println("v5: "+v5);

        //랜덤 (너무 단순함 / random class가 있어서 잘 안씀)
        //0.0 ~ 1.0 사이의 double 타입 난수 리턴
        //1 ~ 10 범위
        int num = (int) (Math.random() * 10) + 1;
        System.out.println(num);
    }
}
