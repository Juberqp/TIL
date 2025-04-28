//Map 문제
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Set;

import java.util.Iterator;

public class Test04 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();

        map.put("사과", 50);
        map.put("바나나", 30);
        map.put("수박", 20);
        map.put("딸기", 60);
        map.put("포도", 10);

        Set<Entry<String, Integer>> set = map.entrySet();
        Iterator<Entry<String, Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        Set<String> set2 = map.keySet();
        Iterator<String> iterator2 = set2.iterator();
        while(iterator2.hasNext()){
            String check = iterator2.next();
            if(map.get(check) < 25){
                iterator2.remove();
            }
        }


        set = map.entrySet();
        iterator = set.iterator();
        while(iterator.hasNext()){
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
