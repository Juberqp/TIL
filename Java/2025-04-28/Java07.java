//매개변수 메소드 참조
@FunctionalInterface
interface Comparable{
    int compare(String a, String b);
}

class Person5{
    void ordering(Comparable comparable){
        String a = "홍길동";
        String b = "김길동";

        int r = comparable.compare(a, b);

        if(r < 0){
            System.out.println(a+"은(는) "+b+"보다 앞에 옵니다.");
        } else if(r == 0){
            System.out.println(a+"은(는) "+b+"와 같습니다.");
        } else {
            System.out.println(a+"은(는) "+b+"보다 뒤에 옵니다.");
        }
    }
}

public class Java07 {
    public static void main(String[] args){
        Person5 person = new Person5();

        //String 클래스의 compareToIgnoreCase 메소드 호출
        person.ordering(String :: compareToIgnoreCase);
    }
}
