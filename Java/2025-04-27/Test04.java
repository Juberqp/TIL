//Stack, Queue 테스트
import java.util.Stack;
import java.util.Queue;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test04 {
    public static void main(String[] args){
        Stack<String> s = new Stack<>();
        Queue<String> q = new LinkedList<>();

        List<String> l = new ArrayList<>(Arrays.asList("Wraith", "Wraith", "Ghoul", "Ghoul", "Ghoul", "Wraith", "Ghoul"));

        //게임 시작!
        for(String i:l){
            if("Wraith".equals(i)){
                //망령
                System.out.print("Wraith 등장! 무기(");
                switch((int)(Math.random()*3)){
                    case 0:
                        s.push("Sword of Light");
                        System.out.print("Sword of Light");
                        break;
                    case 1:
                        s.push("Axe of Fury");
                        System.out.print("Axe of Fury");
                        break;
                    case 2:
                        s.push("Bow of Shadows");
                        System.out.print("Bow of Shadows");
                        break;
                }
                System.out.print(") 추가, ");

                q.offer("Help me!");
                System.out.println("구조 요청 추가!");
            } else {
                //구울
                System.out.print("Ghoul 등장! 무기");

                if(!s.isEmpty()){
                    System.out.printf("(%s) 사용!, ", s.pop());
                } else {
                    System.out.print(" 없음!, ");
                }

                if(!q.isEmpty()){
                    System.out.println("구조요청 사용: "+q.poll());
                } else {
                    System.out.println("구조 요청 없음!");
                }

            }
        }

        System.out.println("[최종 결과] 남은 구조 요청: "+q.size());
        System.out.println("오늘도 살아남았다...");

    }
}
