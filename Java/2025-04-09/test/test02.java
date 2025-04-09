//instanceof
package test;

class Person{
}

class Student extends Person{
}

class Teacher extends Person{
}

public class test02 {
    public static void checkPersonType(Person p){
        if(p instanceof Student student){
            System.out.println("학생입니다.");
        } else if(p instanceof Teacher teacher){
            System.out.println("선생님입니다.");
        } else {
            System.out.println("일반 사람입니다.");
        }
    }
    
    public static void main(String[] args){
        checkPersonType(new Student());
        checkPersonType(new Teacher());
        checkPersonType(new Person());
    }
}
