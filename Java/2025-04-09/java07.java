//추상 클래스 재정의
abstract class Animal{
    //메소드
    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }

    //추상 메소드
    public abstract void sound(); 
}

class Dog extends Animal{
    public void sound(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("야옹");
    }
}

public class java07 {
    public static void animalSound(Animal animal){
        animal.sound();
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog()); //static 메서드를 불러오려면 static 메서드여야 함.
        animalSound(new Cat());
    }
}
