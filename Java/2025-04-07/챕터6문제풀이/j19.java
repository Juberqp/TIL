//setter/getter
package 챕터6문제풀이;

public class j19 {
    public static void main(String[] args){
        Account account = new Account();

        account.setbalance(10000);
        System.out.println("현재 잔고: "+account.getbalance());

        account.setbalance(-100);
        System.out.println("현재 잔고: "+account.getbalance());

        account.setbalance(1000000000);
        System.out.println("현재 잔고: "+account.getbalance());

        account.setbalance(300000);
        System.out.println("현재 잔고: "+account.getbalance());
        
    }
}
