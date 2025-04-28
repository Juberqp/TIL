//List, Set, Map의 Synchronized
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Java05 {
    public static void main(String[] args){
        //Map
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread threadA = new Thread(){
            @Override
            public void run(){
                //객체 1000개 추가
                for(int i=0; i<1000; i++){
                    map.put(i, "내용"+i);
                }
            }
        };

        Thread threadB = new Thread(){
            @Override
            public void run(){
                //객체 1000개 추가
                for(int i=0; i<1000; i++){
                    map.put(i, "내용"+i);
                }
            }
        };

        threadA.run();
        threadB.run();

        try{
            threadA.join();
            threadB.join();
        } catch(Exception e){}

        System.out.println("총 객체 수: "+map.size());
    }
}
