//stack 문제
import java.util.Stack;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        String number = String.valueOf(Math.abs(scanner.nextInt()));

        for(int i=0; i<number.length(); i++){
            stack.push(number.charAt(i) - '0');
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        


    }
}
