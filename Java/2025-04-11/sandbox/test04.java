package sandbox;

abstract class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

    abstract void makeSound();

    void move(){
        System.out.println("동물이 움직입니다.");
    }
}

interface Feedable{
    void eat();
}

interface WildAnimal{
    void hunt();
}

class Lion extends Animal implements WildAnimal, Feedable{
    Lion(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.printf("어흥! %s가 으르렁댑니다.\n", name);
    }
    @Override
    public void eat(){
        System.out.println(name+"가 고기를 먹습니다.");
    }
    @Override
    public void hunt(){
        System.out.println(name+"가 사냥을 시작합니다!");
    }
}

class Rebbit extends Animal implements Feedable{
    Rebbit(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println(name+"는 조용히 씹습니다...");
    }
    @Override
    public void eat(){
        System.out.println(name+"가 당근을 먹습니다.");
    }
}

class Parrot extends Animal implements Feedable{
    Parrot(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println(name+"가 '안녕!' 하고 말합니다.");
    }
    @Override
    public void eat(){
        System.out.println(name+"가 씨앗을 쪼아 먹습니다.");
    }
}

public class test04 {
    public static void main(String[] args){
        Lion l = new Lion("사자");
        Rebbit r = new Rebbit("토끼");
        Parrot p = new Parrot("앵무새");

        Animal[] animal = {l, r, p};
        Feedable[] feed = {l, r, p};
        WildAnimal[] wild = {l};

        for(Animal i : animal) i.makeSound();
        System.out.println();
        for(Animal i : animal) i.move();
        System.out.println();
        for(Feedable i : feed) i.eat();
        System.out.println();
        for(WildAnimal i : wild) i.hunt();
    }
}
