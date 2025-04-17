//정규식
package com.example;

import java.util.regex.Pattern;

public class Java04 {
    public static void main(String[] args){
        //02 or 010 - 3글자 or 4글자 - 4글자
        String regExp = "(02|010-\\d{3,4}-\\d{4})";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data); //정규식, 데이터
        if(result){
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data); //정규식, 데이터
        if(result){
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다");
        }
    }
}
