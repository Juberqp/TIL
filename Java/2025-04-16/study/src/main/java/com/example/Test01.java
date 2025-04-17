package com.example;

import java.util.Scanner;

class Toolbox{
    //반복 1개
    static String tool(char c){
        return String.valueOf(c);
    }

    //반복 여러개
    static String tool(char c, int n){
        return c + String.valueOf(n);
    }
}

public class Test01 {
    public static void main(String[] args){
        //문자 입력
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        char save = str.charAt(0);
        int count = 1;
        String answer = "";
        for(int i=1; i<str.length(); i++){
            if(save != str.charAt(i)){
                if(count == 1){
                    answer += Toolbox.tool(save);
                } else {
                    answer += Toolbox.tool(save, count);
                }
                save = str.charAt(i);
                count = 0;
            }
            ++count;

            if(i+1 == str.length()){
                if(count == 1){
                    answer += Toolbox.tool(save);
                } else {
                    answer += Toolbox.tool(save, count);
                }
            }
        }

        System.out.println(answer);
    }
}
