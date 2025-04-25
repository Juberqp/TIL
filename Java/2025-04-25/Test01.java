//리스트 사용 문제

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
        "level", "world", "radar", "java", "madam", "robot", "noon"
        );

        List<String> check = new ArrayList<>();

        point:
        for(String i:words){
            int first = 0;
            int last = i.length()-1;

            while(first < last){
                if(i.charAt(first) != i.charAt(last)){
                    continue point;
                }
                first++;
                last--;
            }

            check.add(i);
        }

        for(String i:check){
            System.out.println(i);
        }

    }
}
