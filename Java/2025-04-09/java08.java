//봉인된 클래스
sealed class Person permits Employee, Manager{
    public String name;

    public void work(){
        System.out.println("하는 일이 결정되지 않았습니다.");
    }
}

final class Employee extends Person{
    @Override
    public void work(){
        System.out.println("제품을 생산합니다.");
    }
}

non-sealed class Manager extends Person{
    @Override
    public void work(){
        System.out.println("생산 관리를 합니다.");
    }
}

class Director extends Manager{
    @Override
    public void work(){
        System.out.println("제품을 기획합니다.");
    }
}

public class java08 {
    public static void main(String[] args){
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();
    }
}
