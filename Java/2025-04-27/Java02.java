//스택
import java.util.Stack;

class Coin{
    private int value;

    public Coin(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

public class Java02 {
    public static void main(String[] args){
        Stack<Coin> stack = new Stack<>();
        
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(500));
        stack.push(new Coin(10));

        while(!stack.isEmpty()){
            Coin coin = stack.pop();
            System.out.println("꺼낸 동전: "+coin.getValue());
        }
    }
}
