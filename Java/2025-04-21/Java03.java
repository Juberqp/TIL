//와일드 타입 파라미터
class Person{
}
class Worker extends Person{
}
class Student extends Person{
}

class HighStudent extends Student{
}
class MiddleStudent extends Student{
}

class Applicant<T>{
    public T kind;

    public Applicant(T kind){
        this.kind = kind;
    }
}

class Course{
    //모든 사람 등록 가능
    public static void registerCoure1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Coures1을 등록함");
    }

    //학생만 등록 가능
    public static void registerCoure2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Coures2을 등록함");
    }

    //직장인 및 일반인만 등록 가능
    public static void registerCoure3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Coures2을 등록함");
    }
}

public class Java03 {
    public static void main(String[] args){
        //모든 사람이 가능함
        Course.registerCoure1(new Applicant<Person>(new Person()));
        Course.registerCoure1(new Applicant<Worker>(new Worker()));
        Course.registerCoure1(new Applicant<Student>(new Student()));
        Course.registerCoure1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCoure1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        //학생만 신청 가능
        //Course.registerCoure2(new Applicant<Person>(new Person()));
        //Course.registerCoure2(new Applicant<Worker>(new Worker()));
        Course.registerCoure2(new Applicant<Student>(new Student()));
        Course.registerCoure2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCoure2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        //직장인 및 일반인만 신청 가능
        Course.registerCoure3(new Applicant<Person>(new Person()));
        Course.registerCoure3(new Applicant<Worker>(new Worker()));
        //Course.registerCoure2(new Applicant<Student>(new Student()));
        //Course.registerCoure2(new Applicant<HighStudent>(new HighStudent()));
        //Course.registerCoure2(new Applicant<MiddleStudent>(new MiddleStudent()));


    }
}
