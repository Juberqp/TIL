/*
🔥 3단계 문제: 익명 객체 (익명 클래스)
문제
Playable이라는 인터페이스를 선언하고, play()라는 추상 메서드를 하나 정의해.
그다음, 익명 객체를 생성해서 play()를 오버라이딩하고, "익명 객체가 실행됩니다" 를 출력해봐.

요구 사항

Playable 인터페이스 선언

play() 메서드 오버라이드

익명 객체를 이용해 play() 실행

출력 예시: 익명 객체가 실행됩니다
*/

package test;

interface Playable{
    void play();
}

public class test03 {
    public static void main(String[] args){
        Playable p = new Playable(){
            public void play(){
                System.out.println("익명 객체가 실행됩니다");
            }
        };

        p.play();
    }
}
