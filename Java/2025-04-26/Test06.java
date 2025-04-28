//List, Set, Map
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Iterator;
import java.util.Scanner;


public class Test06 {
    public static void main(String[] args){
        //1
        List<String> list = new ArrayList<>(Arrays.asList(
            "노트북", "마우스", "키보드", "모니터", "헤드폰"
        ));

        //2
        Set<String> set = new HashSet<>(list);

        //3
        set.remove("헤드폰");

        //4
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for(String i:set){
            System.out.print(i+"의 가격: ");
            map.put(i, scanner.nextInt());
        }
        System.out.println();

        //5
        Set<Entry<String, Integer>> iSet = map.entrySet();
        Iterator<Entry<String, Integer>> iterator = iSet.iterator();
        while(iterator.hasNext()){
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();

        //6
        List<String> finalList = new ArrayList<>();
        for(String i: map.keySet()){
            if(map.get(i) >= 10){
                finalList.add(i);
            }
        }

        System.out.println("10만원 이상 상품:");
        for(String i:finalList){
            System.out.println(i);
        }
        System.out.println();

        //7
        int sum = 0;
        if(!map.isEmpty()){
            for(String i: map.keySet()){
                sum += map.get(i);
            }
            sum = sum/map.size();
        }
        System.out.println("상품의 평균가: "+sum);

    }
}
