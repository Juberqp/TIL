/*
1단계 문제: 인스턴스 멤버 클래스
문제
사람(Person)이라는 클래스를 만들고, 그 안에 Heart라는 인스턴스 멤버 클래스를 정의해.
Heart 클래스는 beat()라는 메서드를 가지고 있고, "심장이 뛴다" 라는 메시지를 출력해.
그리고 Person 클래스에서 Heart 객체를 생성해서 beat()를 호출해보는 코드를 작성해 봐.

요구사항

클래스 이름: Person

내부 클래스 이름: Heart

출력 예시: 심장이 뛴다
*/

package test;

class Person{
    class Heart{
        void beat(){
            System.out.println("심장이 뛴다.");
        }
    }

    void run(){
        Heart h = new Heart();
        h.beat();
    }
}

public class test01{
    public static void main(String[] args){
        Person p = new Person();
        p.run();
    }
}