//HashSet 출력
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Java06 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("자바");
        set.add("파이썬");
        set.add("c++");
        set.add("엄준식");

        //반복중에 안전하게 삭제
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            //객체 가져오기
            String element = iterator.next();
            System.out.println(element);

            //삭제
            if("자바".equals(element)){
                iterator.remove();
            }
        }
        System.out.println();

        //반복중에 remove 하면 안전하지 않음
        set.remove("파이썬");

        for(String i:set){
            System.out.println(i);
        }
    }
}
