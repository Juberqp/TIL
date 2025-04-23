//동기화 메소드, 블럭 선언
//멀티 스레드를 위한 동기화
class Calculator{
    private int memory;

    public int getMemory(){
        return memory;
    }

    //동기화 메소드
    public synchronized void setMemory1(int memory){
        this.memory = memory;
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
        }
        System.out.println(Thread.currentThread().getName() + ": "+this.memory);
    }

    //동기화 블럭
    public void setMemory2(int memory){
        synchronized(this){
            this.memory = memory;
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
            }
            System.out.println(Thread.currentThread().getName() + ": "+this.memory);
        }
    }
}

//스레드 선언
class User1Thread extends Thread {
    public Calculator calculator;

    User1Thread(){
        setName("User1Thread");
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run(){
        calculator.setMemory1(100);
    }
}

//스레드 선언
class User2Thread extends Thread {
    public Calculator calculator;

    User2Thread(){
        setName("User2Thread");
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run(){
        calculator.setMemory2(50);
    }
} 

public class Java01{
    public static void main(String[] args){
        Calculator c = new Calculator();

        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(c);
        user1Thread.start();

        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(c);
        user2Thread.start();
    }
}