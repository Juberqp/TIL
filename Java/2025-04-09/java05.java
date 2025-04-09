//객체 타입 확인
//자동으로 업캐스팅, 다운캐스팅 해줌
class Person{
    public String name;

    public Person(String name){
        this.name = name;
    }

    public void walk(){
        System.out.println("걷습니다.");
    }
}

class Student extends Person{
    public int studentNo;

    public Student(String name, int studentNo){
        super(name);
        this.studentNo = studentNo;
    }

    public void study(){
        System.out.println("공부합니다.");
    }
}

public class java05 {
    public static void personInfo(Person person){
        System.out.println("name: "+person.name);
        person.walk();

        //person 을 참조하는 객체가 student일 경우
        if(person instanceof Student student){ //자동으로 다운캐스팅 해줌
            System.out.println("studentNo: "+student.studentNo);
            student.study();
        } //student 변수가 사라지면서 자동으로 업캐스팅 해줌
    }
    public static void main(String[] args){
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
