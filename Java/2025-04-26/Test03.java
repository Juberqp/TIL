//Tree문제
import java.util.Map;
import java.util.HashMap;

public class Test03 {
    public static void main(String[] args){
        //1
        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동", 85);
        map.put("김유신", 95);
        map.put("이순신", 78);
        map.put("강감찬", 95);

        //2
        map.put("이순신", 88);

        //3
        map.remove("김유신");

        //4
        if(map.containsKey("홍길동")){
            System.out.println("홍길동은 존재합니다.");
        }

        //5
        for(String i:map.keySet()){
            System.out.println(map.get(i));
        }

        //6
        int sum=0;
        for(String i:map.keySet()){
            sum += map.get(i);
        }
        System.out.println("평균: "+sum/map.size());

        //7
        map.clear();

        //8
        if(map.isEmpty()){
            System.out.println("비어있습니다.");
        }

    }
}
