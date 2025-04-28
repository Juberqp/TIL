import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

@FunctionalInterface
interface ReturnList{
    List<Integer> newList(List<Integer> list);
}

public class Test01 {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> newList = action((list) -> {
            List<Integer> list2 = new ArrayList<>();

            for(int i=0; i<list.size(); i++){
                if(list.get(i) % 2 == 0){
                    list2.add(list.get(i) * list.get(i));
                }
            }

            return list2;
        }, list1);

        System.out.println(newList);
    }

    public static List<Integer> action(ReturnList returnList, List<Integer> list){
        return returnList.newList(list);
    }
}