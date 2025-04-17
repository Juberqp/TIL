//프로세스 종료
package com.example;

public class Java04 {
    public static void main(String[] args){
        for(int i = 0; i<10; i++){
            System.out.println(i);
            if(i == 5){
                System.out.println("JVM 종료");
                System.exit(0);
            }
        }
    }
}
