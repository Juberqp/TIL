//리스트 문제
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class Test01{
    public static void main(String[] args){
        //1
        List<String> list = new ArrayList<>(Arrays.asList("상자1", "상자2", "상자3"));

        //2
        list.set(list.indexOf("상자2"), "특급상자");

        //3
        list.remove(list.indexOf("상자3"));

        //4
        list.add(0, "긴급상자");

        //5
        for(String i:list){
            System.out.println(i);
        }

        //6
        System.out.println(list.size());

        //7
        if(list.indexOf("상자4")!=-1){
            System.out.println("상자가 존재합니다.");
        }

        //8
        list.clear();

        //9
        if(list.isEmpty()){
            System.out.println("리스트가 비었습니다.");
        }

    }
}