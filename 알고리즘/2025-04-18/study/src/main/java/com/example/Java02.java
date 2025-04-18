//선택 정렬
package com.example;

public class Java02 {
    public static void main(String[] args){
        int[] num = {8, 1, 2, 4, 7, 9, 3, 6, 5};

        //인덱스 위치만 저장, 값은 저장하지 않아도 됨
        for(int i=0; i<num.length; i++){
            int check = i;
            for(int j=i+1; j<num.length; j++){
                if(num[check] > num[j]){
                    check = j;
                }
            }
            int tmp = num[i];
            num[i] = num[check];
            num[check] = tmp;
        }

        for(int i:num){
            System.out.print(i+" ");
        }
    }
}
