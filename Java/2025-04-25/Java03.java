//TreeMap
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Java03 {
    public static void main(String[] args){
        //TreeMap 컬랙션
        TreeMap<String, Integer> treemap = new TreeMap<>();

        //저장
        treemap.put("Honeydew", 80);      // H
        treemap.put("Kiwi", 110);         // K
        treemap.put("Apple", 10);         // A
        treemap.put("Fig", 60);           // F
        treemap.put("Grapes", 70);        // G
        treemap.put("Blueberry", 20);     // B
        treemap.put("Elderberry", 50);    // E
        treemap.put("Cherry", 30);        // C
        treemap.put("Date", 40);          // D
        treemap.put("Indian Fig", 90);    // I
        treemap.put("Jackfruit", 100);    // J

        //정렬 엔트리 출력
        Set<Entry<String, Integer>> entryTree = treemap.entrySet();
        for(Entry i:entryTree){
            System.out.println(i.getKey()+", "+i.getValue());
        }
        System.out.println();

        //특정 키의 값 가져오기
        Entry<String, Integer> entry = null;
        entry = treemap.firstEntry(); //맨앞
        System.out.println("제일 앞 단어: "+entry.getKey()+", "+entry.getValue());
        entry = treemap.lastEntry(); //맨뒤
        System.out.println("제일 뒷 단어: "+entry.getKey()+", "+entry.getValue());
        entry = treemap.lowerEntry("Date"); //Date 앞 단어
        System.out.println("Date 앞 단어: "+entry.getKey()+", "+entry.getValue());
        entry = treemap.higherEntry("Date"); //Date 뒤 단어
        System.out.println("Date 뒤 단어: "+entry.getKey()+", "+entry.getValue());
        System.out.println();

        //역순
        NavigableMap<String, Integer> descendingMap = treemap.descendingMap();
        Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
        for(Entry i:descendingEntrySet){
            System.out.println(i.getKey()+", "+i.getValue());
        }
        System.out.println();

        //범위 검색
        System.out.println("범위 검색 B ~ E");
        NavigableMap<String, Integer> rangeMap = treemap.subMap("B", true, "E", true);
        for(Entry<String, Integer> i:rangeMap.entrySet()){
            System.out.println(i.getKey()+", "+i.getValue());
        }
    }
}
