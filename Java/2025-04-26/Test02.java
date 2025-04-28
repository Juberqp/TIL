//Set 문제
import java.util.Arrays;

import java.util.Set;
import java.util.HashSet;

public class Test02 {
    public static void main(String[] args){
        //1
        Set<String> set = new HashSet<>(Arrays.asList(
            "홍길동", "이순신", "김유신", "홍길동"
        ));

        //2
        if(set.contains("이순신")){
            System.out.println("이순신이 명단에 있습니다.");
        }

        //3
        if(!set.contains("강감찬")){
            set.add("강감찬");
        }

        //4
        set.remove("김유신");

        //5
        for(String i:set){
            System.out.println(i);
        }

        //6
        if(set.isEmpty()){
            System.out.println("명단이 비어있습니다.");
        }

        //7
        set.clear();
        if(set.isEmpty()){
            System.out.println("명단이 비어있습니다.");
        }
    }
}
