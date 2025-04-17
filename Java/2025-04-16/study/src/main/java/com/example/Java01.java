//롬북
//pom.xml에 선언됨
package com.example;

import lombok.Data; //생성자, getter/setter, equals, hashcode, toString
import lombok.NoArgsConstructor; //기본 생성자 (매개변수 없음)
import lombok.AllArgsConstructor; //모든 필드 초기화하는 생성자 포함

//컴파일 과정에서 롬북이 자동으로 만들어줌
//이것이 에노테이션 프로세서.
@Data
@NoArgsConstructor
@AllArgsConstructor
class Member{
    private String id;
    private String name;
    private int age;

    //롬북 기본 설정이 마음에 안들면 수정 가능
    @Override
    public String toString(){
        return id+","+name+","+Integer.toString(age);
    }
}

public class Java01 {
    public static void main(String[] args){
        Member member1 = new Member();
        Member member2 = new Member("아이디", "이름", 12);

        System.out.println(member2.getId());
        System.out.println(member2.getName());
        System.out.println(member2.getAge());

        System.out.println(member2.toString());

    }
}
