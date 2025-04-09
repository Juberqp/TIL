//다형성 문제
package test;

class Animal{
    void makeSound(){
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("멍멍!");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("야옹!");
    }
}

class Cow extends Animal{
    @Override
    void makeSound(){
        System.out.println("음메!");
    }
}

//다형성 테스트
public class test01{
    public static void printAnimalSound(Animal a){
        a.makeSound();
    }
    public static void main(String[] args){
        printAnimalSound(new Dog());
        printAnimalSound(new Cat());
        printAnimalSound(new Cow());

    }
}