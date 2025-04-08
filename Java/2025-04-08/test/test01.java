package test;

class Character{
    protected String name;
    protected int attackPower;
    protected int health;

    Character(String name, int attackPower, int health){
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    void showInfo(){
        System.out.println("이름: "+name+", 공격력: "+attackPower+", 체력: "+health);
    }
}

class Warrior extends Character{
    Warrior(String name, int attackPower, int health){
        super(name, (attackPower+attackPower/100*20), health);
    }
    void castSpell(){
        System.out.println("Warrior "+name+"이(가) 강한 일격을 가합니다!");
    }
}

class Mage extends Character{
    Mage(String name, int attackPower, int health){
        super(name, attackPower, (health+health/100*30));
    }

    void castSpell(){
        System.out.println("Mage "+name+"이(가) 강력한 마법을 시전합니다!");
    }
}

class GameManager{
    private static GameManager g = new GameManager();

    private GameManager(){
    }

    public static GameManager getInstance(){
        return g;
    }

    // 전투를 수행하는 메서드
    public void battle(Character c1, Character c2) {
        System.out.println(c1.name + "이(가) " + c2.name + "와(과) 전투를 시작합니다!");
    }
}

public class test01 {
    public static void main(String[] args){
        Warrior w = new Warrior("Thor", 100, 100);
        Mage m = new Mage("Gandalf", 100, 100);
        GameManager g = GameManager.getInstance();
        w.showInfo();
        m.showInfo();

        g.battle(w, m);
        w.castSpell();
        m.castSpell();


    }
}
