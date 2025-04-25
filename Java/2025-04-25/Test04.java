//Set 테스트
import java.util.List;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class Test04 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        //1
        set.add("홍길동");
        set.add("권중택");
        set.add("이기영");
        set.add("이순신");
        set.add("홍길동");

        //2
        if(set.contains("홍길동")){
            System.out.println("값이 존재합니다.");
        }

        //3
        set.remove("이순신");

        //4
        System.out.println("현재 인원 수: "+set.size());

        //5
        set.clear();

        //6
        if(set.isEmpty()){
            System.out.println("비어있음");
        }
        
    }
}
