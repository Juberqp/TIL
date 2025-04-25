//리스트 문제

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Iterator;

public class Test03 {
    public static void main(String[] args){
        //1.창고에 다음 상자들을 추가한다.
        List<String> boxs = new ArrayList<>(Arrays.asList(
            "A123", "B456", "C789", "B456", "D000"
        ));
        System.out.println("boxs 리스트");
        for(String i:boxs){
            System.out.println(i);
        }

        //2."B456" 상자가 몇 개인지 확인한다.
        int count=0;
        for(String i:boxs){
            if("B456".equals(i)){
                count++;
            }
        }
        System.out.println("B456 갯수: "+count);

        //3."C789" 상자의 인덱스를 찾아서, 그 위치를 "Z999"로 수정한다.
        boxs.set(boxs.indexOf("C789"), "Z999");
        System.out.println("C789 -> Z999");
        for(String i:boxs){
            System.out.println(i);
        }

        //4.모든 "B456" 상자를 제거한다.
        Iterator<String> iterator = boxs.iterator();
        while(iterator.hasNext()){
            if("B456".equals(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println("B456 전부 제거");
        for(String i:boxs){
            System.out.println(i);
        }

        //5.리스트에 "E111" 상자가 없으면 맨 앞에 삽입한다.
        if(boxs.indexOf("E111") == -1){
            boxs.add(0, "E111");
        }
        System.out.println("E111 삽입");
        for(String i:boxs){
            System.out.println(i);
        }

        //6.리스트의 중간 2개만 출력한다. (subList 사용)
        int index = boxs.size()/2;
        List<String> two = boxs.subList(index-1, index+1);
        System.out.println("중간 2개 출력");
        for(String i:two){
            System.out.println(i);
        }

        //.7 소문자 바꾸는 메소드
        //이 문제는 List 사용 방법을 배우는거라 제외함
        //그냥 새로운 리스트 만들어서 소문자로 바꿔 저장하면 되잖아.
        
        //8.리스트를 전부 초기화(clear)
        boxs.clear();

        System.out.println("clear 확인");
        for(String i:boxs){
            System.out.println(i);
        }
    }
}
