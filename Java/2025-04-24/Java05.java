//HashSet
import java.util.Set;
import java.util.HashSet;

class Member{
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    //재정의 하여 name과 age로 객체를 비교, 같다고 판정하여 1개만 저장함
    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member target){
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}

public class Java05 {
    public static void main(String[] args){
        //HashSet
        Set<Member> set = new HashSet<>();

        //원래는 객체끼리 비교하기 때문에 다르다고 판단하여 둘다 저장함
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("저장된 객체 갯수: "+set.size());
    }
}
