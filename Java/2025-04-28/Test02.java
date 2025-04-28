import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


@FunctionalInterface
interface Lambda{
    List<String> action(List<String> list);
}

class Check{
    List<String> length(Lambda lambda, List<String> list){
        return lambda.action(list);
    } 
}

public class Test02 {
    public static void main(String[] args){
        List<String> firstList = new ArrayList<>(Arrays.asList("apple", "hi", "banana", "sun", "orange"));
        Check check = new Check();

        List<String> newList = check.length((list) -> {
            List<String> tmpList = new ArrayList<>();

            for(String i:list){
                if(i.length() >= 5){
                    tmpList.add(i.toUpperCase());
                }
            }

            return tmpList;
        }, firstList);

        System.out.println(newList);
    }
}
