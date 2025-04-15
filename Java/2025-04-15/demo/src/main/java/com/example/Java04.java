//예외 발생시키기
package com.example;

//사용자 지정 예외
class InsufficientException extends Exception{
    InsufficientException() {}
    InsufficientException(String message){
        super(message);
    }
}

class Account{
    private long balance;

    public Account() {}

    //getter
    public long getBalance(){
        return balance;
    }

    //setter
    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException{
        if(balance < money){
            throw new InsufficientException("잔고 부족: "+(money-balance+" 모자람"));
        }
        balance -= money;
    }
}

public class Java04 {
    public static void main(String[] args){
        Account account = new Account();

        //예금
        account.deposit(10000);
        System.out.println("예금액: "+account.getBalance());

        try{
            account.withdraw(30000);
        } catch(InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
