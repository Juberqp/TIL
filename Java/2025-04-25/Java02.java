//TreeSet
import java.util.TreeSet;
import java.util.NavigableSet;

public class Java02 {
    public static void main(String[] args){
        //TreeSet 컬랙션
        TreeSet<Integer> score = new TreeSet<>();

        //저장
        score.add(87);
        score.add(98);
        score.add(75);
        score.add(95);
        score.add(80);

        //출력
        for(Integer i:score){
            System.out.println(i+" ");
        }
        System.out.println();

        //특정 값
        System.out.println("가장 낮은 점수: "+score.first());
        System.out.println("가장 높은 점수: "+score.last());
        System.out.println("95점 아래 점수: "+score.lower(95));
        System.out.println("95점 위에 점수: "+score.higher(95));
        System.out.println("95점이거나 바로 아래 점수: "+score.floor(95));
        System.out.println("85점이거나 바로 위 점수: "+score.ceiling(85));

        //내림차순 정렬
        NavigableSet<Integer> rangeSet = score.descendingSet();
        for(Integer i:rangeSet){
            System.out.println(i+" ");
        }
        System.out.println();

        //범위 검색 (80 <= i < 90)
        rangeSet = score.subSet(80, true, 90, false);
        for(Integer i:rangeSet){
            System.out.println(i+" ");
        }
    }
}
