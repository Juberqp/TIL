//Map, Iterator, EntrySet
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Set;

import java.util.Iterator;


public class Test05 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();

        map.put("노트북", 120);
        map.put("모니터", 30);
        map.put("키보드", 5);
        map.put("마우스", 2);
        map.put("헤드폰", 8);

        Set<Entry<String, Integer>> set = map.entrySet();
        Iterator<Entry<String, Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();

        iterator = set.iterator();
        while(iterator.hasNext()){
            Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() <= 10){
                iterator.remove();
            }
        }

        iterator = set.iterator();
        while(iterator.hasNext()){
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();

        int sum = 0;
        if(!map.isEmpty()){
            for(String i:map.keySet()){
                sum += map.get(i);
            }
        }

        System.out.println("평균 가격: "+sum/map.size());
    }
}
