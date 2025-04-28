//매개변수 없는 람다식

@FunctionalInterface
interface Wokeable{
    void work();
}

class Person{
    void action(Wokeable wokeable){
        wokeable.work();
    }
}

public class Java02 {
    public static void main(String[] args){
        Person person = new Person();

        person.action(() -> {
            System.out.println("출근 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        //실행문이 1개일 경우 {} 생략 가능
        person.action(() -> System.out.println("퇴근 합니다."));
    }
}
