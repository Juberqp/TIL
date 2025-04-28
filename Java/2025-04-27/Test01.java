import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Iterator;

public class Test01{
    public static void main(String[] args){
        //영웅 이름, 장비
        Map<String, Set<String>> map = new HashMap<>();

        //최근 장비 목록, 5개 까지
        List<String> list = new ArrayList<>();

        //1.영웅 추가
        if(!map.containsKey("V"))
            map.put("V", new HashSet<>());
        if(!map.containsKey("데이비드"))
            map.put("데이비드", new HashSet<>());
        if(!map.containsKey("루시"))
            map.put("루시", new HashSet<>());
        if(!map.containsKey("레베카"))
            map.put("레베카", new HashSet<>());
        if(!map.containsKey("잡졸1"))
            map.put("잡졸1", new HashSet<>());

        //2.장비 추가
        Set<String> item = map.get("V");
        item.add("산테비스탄");
        item.add("샷건");
        item.add("카타나");
        map.put("V", item);
        for(String i:item){
            list.add(i);
        }
        if(list.size() > 5){
            list = list.subList(list.size()-5, list.size());
        }
        item.clear();

        item.add("산테비스탄");
        item.add("소총");
        map.put("데이비드", item);
        for(String i:item){
            list.add(i);
        }
        if(list.size() > 5){
            list = list.subList(list.size()-5, list.size());
        }
        item.clear();

        item.add("넷핵");
        item.add("권총");
        item.add("와이어");
        map.put("루시", item);
        for(String i:item){
            list.add(i);
        }
        if(list.size() > 5){
            list = list.subList(list.size()-5, list.size());
        }
        item.clear();

        item.add("버서크");
        item.add("샷건");
        item.add("샷건");
        map.put("레베카", item);
        for(String i:item){
            list.add(i);
        }
        if(list.size() > 5){
            list = list.subList(list.size()-5, list.size());
        }
        item.clear();

        //3.특정 영웅의 장비 목록 출력
        System.out.println("V : "+map.get("V"));
        System.out.println("레베카 : "+map.get("레베카"));
        System.out.println();

        //4.전체 영웅 + 장비 목록 출력
        Set<Entry<String, Set<String>>> mapToSet = map.entrySet();
        Iterator<Entry<String, Set<String>>> iterator = mapToSet.iterator();
        while(iterator.hasNext()){
            Entry<String, Set<String>> entry = iterator.next();

            //null 무시
            if(entry.getValue() != null)
                System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();

        //5.영웅 삭제
        map.remove("데이비드");
        map.remove("레베카");

        //6.장비 삭제
        Set<String> removeItem = map.get("루시");
        removeItem.remove("권총");

        //7.최근 등록한 장비 목록 출력
        System.out.print("최근 등록한 장비 목록: ");
        for(String i:list){
            System.out.print(i+" ");
        }
    }
}