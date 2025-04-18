//버블 정렬
package com.example;

public class Java01 {
    public static void main(String[] args){
        int[] num = {8, 1, 2, 4, 7, 9, 3, 6, 5};

        //배열 전부 둘러보기
        for(int i=0; i<num.length-1; i++){
            for(int j=0; j<num.length-1-i; j++){
                if(num[j] > num[j+1]){
                    int tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }
            }
        }

        for(int i:num){
            System.out.printf("%d, ",i);
        }
    }
}
