//진행 시간 읽기
//1970년 1월 1일 부터 현재까지 가능
package com.example;

public class Java05 {
    public static void main(String[] args){
        //1/10^9초 단위로 진행된 시간을 리턴
        long time1 = System.nanoTime();
        int sum = 0;
        for(int i=1; i<1000000; i++){
            sum += i;
        }

        long time2 = System.nanoTime();
        System.out.println("1~1000000까지의 합: "+sum);
        System.out.println("총 계산 시간: "+(time2-time1)+" 나노초 소요");
    }
}
