//생성자 참조

@FunctionalInterface
interface Creatable1{
    Member create(String id);
}

@FunctionalInterface
interface Creatable2{
    Member create(String id, String name);
}

class Member{
    private String id;
    private String name;

    Member(String id){
        this.id = id;
        System.out.println("Member(String id)");
    }

    Member(String id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Member(String id, String name)");
    }

    @Override
    public String toString(){
        String info = "{ id: "+id+", name: "+name+" }";
        return info;
    }
}

class Person6{
    Member getMember1(Creatable1 creatable){
        String id = "winter";
        Member member = creatable.create(id);
        return member;

    }

    Member getMember2(Creatable2 creatable){
        String id = "winter";
        String name = "한겨울";
        Member member = creatable.create(id, name);
        return member;
    }
}

public class Java08 {
    public static void main(String[] args){
        Person6 person = new Person6();

        Member m1 = person.getMember1(Member :: new);
        System.out.println(m1);
        System.out.println();

        Member m2 = person.getMember2(Member :: new);
        System.out.println(m2);
    }
}
