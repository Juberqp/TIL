//Map
//HashMap
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry; //키와 값을 하나로 묶는 객체
import java.util.Iterator;
import java.util.Set;

public class Java08 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); //키값이 같기 때문에 value 값만 수정

        System.out.println("총 Entry 수: "+map.size());
        System.out.println();

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key+" : "+value);
        System.out.println();

        Set<String> KeySet = map.keySet();
        Iterator<String> keyIterator = KeySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k+" : "+v);
        }
        System.out.println();

        //더 효율적
        //Entry를 Set에 넣고 map.entrySet(); 이 키와 값을 Entry 객체에 맞게 넣어 반환
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+" : "+v);
        }
        System.out.println();

        //map 삭제
        map.remove("홍길동");
        System.out.println("총 엔트리 수:"+map.size());
    }
}
