//instanceof
package sandbox;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class test01 {
    public static void checkObjectType(Animal obj) {
        if (null == obj){
            //null 확인부터
        } else if (obj instanceof Dog){
            System.out.println("이 객제는 Dog입니다.");
        } else if (obj instanceof Cat){
            System.out.println("이 객제는 Cat입니다.");
        } else if (obj instanceof Animal){
            System.out.println("이 객제는 Animal입니다."); //Animal은 Dog도 될 수 있고 Cat도 될 수 있으니 나중에
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        checkObjectType(a1); // "이 객체는 Dog입니다!"
        checkObjectType(a2); // "이 객체는 Cat입니다!"
        checkObjectType(a3); // "이 객체는 Animal입니다!"
    }
}
