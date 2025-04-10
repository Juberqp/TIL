package sandbox;

interface CanBark{
    void bark();
}

interface CanMeow{
    void meow();
}

abstract class Animal{
    private int leg;

    Animal(int leg){
        this.leg = leg;
    }

    void showLegs(){
        System.out.println("이 동물은 "+leg+"개의 다리를 가졌습니다.");
    }
}

class DogCat implements CanBark, CanMeow{
    public void bark(){
        System.out.println("멍멍!");
    }

    public void meow(){
        System.out.println("야옹~");
    }
}

class DogCatV2 extends Animal{
    DogCatV2(int leg){
        super(leg);
    }

    public void bark(){
        System.out.println("멍멍!");
    }

    public void meow(){
        System.out.println("야옹~");
    }

    void showLegs(){
        System.out.println("이 동물은 X개의 다리를 가졌습니다.");
    }
}

public class test04 {
    public static void main(String[] args){
        DogCatV2 pet = new DogCatV2(4);
        pet.showLegs(); // 출력: 이 동물은 4개의 다리를 가졌습니다.
        pet.bark();     // 출력: 멍멍!
        pet.meow();     // 출력: 야옹~
    }
}
