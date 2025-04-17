//Random 클래스
package com.example;

import java.util.Random;
import java.util.Arrays;

public class Java01 {
    public static void main(String[] args){
        //선택 번호
        int[] num = new int[6];
        Random r = new Random(3);
        System.out.println("선택 번호: ");

        for(int i=0; i<6; i++){
            num[i] = r.nextInt(45)+1; //선택 번호 6개
            System.out.print(num[i]+" ");
        }
        System.out.println();

        //당첨 번호
        int[] winner = new int[6];
        r = new Random(5);
        System.out.println("당첨 번호: ");

        for(int i=0; i<6; i++){
            winner[i] = r.nextInt(45)+1; //선택 번호 6개
            System.out.print(winner[i]+" ");
        }
        System.out.println();

        //당첨 여부
        Arrays.sort(num);
        Arrays.sort(winner);

        boolean result = Arrays.equals(num, winner);
        System.out.print("당첨 여부: ");

        if(result){
            System.out.println("1등 당첨!");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }

    }
}
