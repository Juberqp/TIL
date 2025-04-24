//LinkedList
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Java03 {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long starttime;
        long endtime;

        starttime=System.nanoTime();
        for(int i=0; i<10000; i++){
            list1.add(0, String.valueOf(i));
        }
        endtime=System.nanoTime();
        System.out.printf("%-17s %8d ns\n", "ArrayList 걸린 시간: ", endtime-starttime);

        //단순 삽입은 LinkedList가 더 빠르다.
        starttime=System.nanoTime();
        for(int i=0; i<10000; i++){
            list2.add(0, String.valueOf(i));
        }
        endtime=System.nanoTime();
        System.out.printf("%-17s %8d ns\n", "LinkedList 걸린 시간: ", endtime-starttime);
    }
}
