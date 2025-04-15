//Object 클래스
//클래스가 다른 클래스를 상속 받지 않으면 암시적으로 java.lang.Object 상속
package com.example;

class Member{
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    //Object 속 equals 재정의
    public boolean equals(Object obj){
        if(obj instanceof Member target){
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;
    }
}

public class Java05 {
    public static void main(String[] args){
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        //재정의 된 equals
        if(obj1.equals(obj2)){
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        if(obj1.equals(obj3)){
            System.out.println("obj1과 obj3는 동등합니다.");
        } else {
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }

    }
}
