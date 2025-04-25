//리스트 응용

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Collections;

public class Test02 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(
        7, 2, 4, 9, 1, 8, 3, 6, 5
        );

        List<Integer> twozero = new ArrayList<>();
        List<Integer> twoone = new ArrayList<>();

        for(Integer i:numbers){
            if(i%2 == 0){
                twozero.add(i);
            } else {
                twoone.add(i);
            }
        }

        Collections.sort(twozero);
        Collections.sort(twoone, Collections.reverseOrder());

        System.out.println("짝수 그룹:");
        for(Integer i:twozero){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("홀수 그룹:");
        for(Integer i:twoone){
            System.out.println(i);
        }
        System.out.println();

        twozero.addAll(twoone);

        System.out.println("짝수+홀수 그룹:");
        for(Integer i:twozero){
            System.out.println(i);
        }
        System.out.println();
    }
}
