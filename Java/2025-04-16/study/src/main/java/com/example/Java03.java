//read()
//엔터를 누르기 전까지 대기, 엔터 입력 시 하나씩 처리함
package com.example;

public class Java03 {
    public static void main(String[] args) throws Exception{
        int speed = 0;
        int keyCode = 0;

        while(true){
            //Enter키를 읽지 않을때만 실행
            if(keyCode != 13 && keyCode != 10){
                //각각 아스키 1 2 3
                if(keyCode == 49){
                    speed++;
                } else if(keyCode == 50) {
                    speed--;
                } else if(keyCode == 51){
                    break;
                }

                System.out.println("-----------------------");
                System.out.println("1.증속 | 2.감속 | 3.중지");
                System.out.println("-----------------------");
                System.out.println("현재 속도: "+speed);
                System.out.print("선택: ");
            }

            //키를 하나씩 읽음
            keyCode = System.in.read();
        }

        System.out.println("시스템 종료");
    }
}
