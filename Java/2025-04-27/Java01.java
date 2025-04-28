//스택
import java.util.Stack;

public class Java01 {
    public static void main(String[] args){
        //생성
        Stack<Integer> stack = new Stack<>();

        //값 넣기
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //값 빼기
        stack.pop();
        stack.pop();

        //맨위 값 보기
        System.out.println(stack.peek());
    }
}
