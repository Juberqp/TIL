/*
💀 4단계 문제: 로컬 클래스 + 바깥 멤버 접근
문제
Outer 클래스에 int outerField = 100; 선언하고,
display() 메서드 안에 로컬 클래스 Inner를 선언해.
그 로컬 클래스에서 outerField 값을 출력하는 show() 메서드를 만들고, show()를 호출해봐.

요구사항

로컬 클래스 사용

바깥 클래스 멤버(outerField) 접근

출력: 바깥 필드 값: 100
*/

package test;

class Outer{
    int outerField = 100;

    void display(){
        class Inner{
            void show(){
                System.out.println("바깥 필드 값: "+Outer.this.outerField);
            }
        }

        Inner i = new Inner();
        i.show();
    }
}

public class test04 {
    public static void main(String[] args){
        Outer o = new Outer();
        o.display();
    }
}
