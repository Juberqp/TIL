package 챕터6문제풀이;

public class Account2 {
    public String num;
    public String name;
    public int money;

    public Account2(String num, String name, int money){
        this.num = num;
        this.name = name;
        this.money = money;
    }

    public void in(int money){
        this.money += money;
    }
    public void out(int money){
        this.money -= money;
    }
}
