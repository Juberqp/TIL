import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.function.Function;

public class Test03 {
    public static void main(String[] args){
        List<String> firstList = new ArrayList(Arrays.asList(
        "Apple", "Banana", "avocado", "Cat", "apricot", "dog"
        ));

        //전부 소문자
        for(int i=0; i<firstList.size(); i++){
            firstList.set(i, firstList.get(i).toLowerCase());
        }

        //a 만 체크
        Iterator<String> iterator = firstList.iterator();
        while(iterator.hasNext()){
            char c = iterator.next().charAt(0);
            if(c != 'a')
                iterator.remove();
        }

        //람다식
        Function<List<String>, List<Integer>> action = (list) -> {
            List<Integer> finalList = new ArrayList<>();

            for(String i:list){
                finalList.add(i.length());
            }
            
            return finalList;
        };

        System.out.println(action.apply(firstList));
    }    
}
