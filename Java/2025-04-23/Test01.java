//스레드 연습
class Account{
    private int balance = 100;

    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " 출금 시도: " + amount);
        if(balance < amount){
            System.out.println(Thread.currentThread().getName() + "잔고 부족");
        } else {
            try { Thread.sleep(10); } catch (InterruptedException e) {}
            balance -= amount;
            System.out.println("현재 잔고: "+balance);

        }
    }
}

class TA extends Thread{
    private Account account;

    TA(Account account){
        this.account = account;
    }

    @Override
    public void run(){
        for(int i=0; i<50; i++){
            account.withdraw(1);
        }
    }
}

class TB extends Thread{
    private Account account;

    TB(Account account){
        this.account = account;
    }

    @Override
    public void run(){
        for(int i=0; i<50; i++){
            account.withdraw(1);
        }
    }
}

public class Test01 {
    public static void main(String[] args){
        Account account = new Account();

        TA a = new TA(account);
        TB b = new TB(account);

        a.start();
        b.start();
    }
}
