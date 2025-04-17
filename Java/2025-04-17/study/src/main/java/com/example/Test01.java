//알고리즘 문제
package com.example;

import java.util.*;

public class Test01 {
    public static void main(String[] args){
        int[] numbers = {2, 1, 3, 4, 1};

        int sum = 0;
        TreeSet<Integer> answer = new TreeSet<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                sum = numbers[i] + numbers[j];
                answer.add(sum);
            }
        }

        System.out.println(answer);
    }
}
