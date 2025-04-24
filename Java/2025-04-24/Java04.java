//set - Hashset
//중복 값은 저장하지 않음
import java.util.Set;
import java.util.HashSet;

public class Java04 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); //중복 값
        set.add("Spring");

        System.out.println("총 객체 수: "+set.size());
    }
}
