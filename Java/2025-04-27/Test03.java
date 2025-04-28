import java.util.Scanner;
import java.util.Stack;

public class Test03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        String text = scanner.nextLine();

        for(int i=0; i<text.length(); i++){
            stack.push(text.charAt(i));
        }

        for(int i=0; i<text.length(); i++){
            System.out.print(stack.pop());
        }
    }
}
