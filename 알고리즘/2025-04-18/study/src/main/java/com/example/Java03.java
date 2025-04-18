//삽입 정렬
package com.example;

public class Java03 {
    public static void main(String[] args){
        int[] num = {8, 1, 2, 4, 7, 9, 3, 6, 5};

        for(int i=1; i<num.length; i++){
            int save = num[i];
            for(int j=i-1;; j--){
                if(num[j] > save){
                    num[j+1] = num[j];
                    if(j==0){
                        num[j] = save;
                        break;
                    }
                } else if(num[j] < save){
                    num[j+1] = save;
                    break;
                }
            }
        }

        for(int i:num){
            System.out.print(i+" ");
        }
    }
}
