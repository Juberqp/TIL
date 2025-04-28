//수정할 수 없는 컬렉션
import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;

public class Java06 {
    public static void main(String[] args){
        //불변 List
        List<String> list = List.of("A", "B", "C");

        //불변 Set
        Set<String> set = Set.of("A", "B", "c");

        //불변 Map
        Map<Integer, String> map = Map.of(
            1, "A",
            2, "B",
            3, "C"
        );

        //List 컬렉션을 불변으로 복사
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        List<String> l2 = List.copyOf(l); //불변

        //Set 컬렉션을 불변으로 복사
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        Set<String> s2 = Set.copyOf(s); //불변

        //Set 컬렉션을 불변으로 복사
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "A");
        m.put(2, "B");
        m.put(3, "C");
        Map<Integer, String> m2 = Map.copyOf(m); //불변

        //배열을 불변 리스트로 생성
        String[] arr = {"A", "B", "C"};
        List<String> l3 = List.of(arr);
    }
}
