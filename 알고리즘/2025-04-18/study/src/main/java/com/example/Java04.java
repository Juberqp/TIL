//퀵 정렬
package com.example;

import java.util.*;

class zblr{
    List<Integer> p(List<Integer> num){
        //재귀 마지막
        if (num.size() <= 1)
            return num;

        //중앙 선택, 피벗
        int pivot = num.get(num.size()/2);

        //왼쪽과 오른쪽 나누기
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        //피벗을 제외한 나머지 왼쪽 오른쪽 넣기
        for(int i=0; i<num.size(); i++){
            if(i == num.size() / 2) //피벗 무시
                continue;

            if(num.get(i) < pivot){
                left.add(num.get(i));
            } else if(num.get(i) > pivot){
                right.add(num.get(i));
            }
        }

        //재귀호출
        List<Integer> sortleft = p(left);
        List<Integer> sortright = p(right);
        List<Integer> answer = new ArrayList<>();
        answer.addAll(sortleft);
        answer.add(pivot);
        answer.addAll(sortright);
        
        return answer;
    }
}

public class Java04 {
    public static void main(String[] args){
        List<Integer> answer = new ArrayList<>(Arrays.asList(8, 1, 2, 4, 7, 9, 3, 6, 5));

        zblr test = new zblr();
        answer = test.p(answer);

        for(int i:answer){
            System.out.print(i+" ");
        }
    }
}
