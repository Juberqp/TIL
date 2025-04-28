//매개변수 있는 람다식

@FunctionalInterface
interface Workable{
    void work(String name, String job);
}

@FunctionalInterface
interface Speakable{
    void work2(String content);
}

class Person2{
    void action(Workable workable){
        workable.work("홍길동", "프로그래머");
    }

    void action2(Speakable speakable){
        speakable.work2("안녕하세요.");
    }
}

public class Java04 {
    public static void main(String[] args){
        Person2 person = new Person2();

        person.action((name, job) -> {
            System.out.print(name+"이 ");
            System.out.println(job+"을 합니다.");
        });

        //{} 생략
        person.action((name, job) -> System.out.println(name+"이 "+job+"을 합니다."));

        //() 생략
        person.action2(word -> {
            System.out.print("\""+word+"\"");
            System.out.println("라고 말합니다.");
        });

        //() {} 생략
        person.action2(word -> System.out.print("\""+word+"\""+"라고 말합니다."));
    }
}
