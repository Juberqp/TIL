//Date 클래스
package com.example;

import java.util.*;
import java.text.*;

public class Java02 {
    public static void main(String[] args){
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        //심플 데이터 포멧 방법, 나중에 나온다.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);
    }
}
