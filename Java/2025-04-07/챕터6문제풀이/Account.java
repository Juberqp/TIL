package 챕터6문제풀이;

public class Account {
    final int MAX = 1000000;
    final int MIN = 0;
    int balance = 0;

    void setbalance(int b){
        if(MAX >= b && b >= MIN){
            balance = b;
        }
    }

    int getbalance(){
        return balance;
    }
}
