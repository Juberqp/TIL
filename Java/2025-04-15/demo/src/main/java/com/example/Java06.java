//객체 해시코드
//객체를 식별하는 정수
package com.example;

class Student{
    private int no;
    private String name;

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }

    //getter
    public int getNo(){
        return no;
    }
    //getter
    public String getName(){
        return name;
    }

    //해시코드 재정의
    //숫자 + "홍길동"의 해쉬코드
    @Override
    public int hashCode(){
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    //equals 재정의
    @Override
    public boolean equals(Object obj){
        //obj가 Student와 같은 객체인가?
        if(obj instanceof Student target){
            //no가 같은가? / name이 같은가?
            if(no == target.getNo() && name.equals(target.getName())){
                return true;
            }
        }
        return false;
    }
}

public class Java06 {
    public static void main(String[] args){
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        //단어가 달라도 해쉬코드는 같을 수 있으니
        //해쉬코드 체크 후, 단어를 체크한다.
        if(s1.hashCode() == s2.hashCode()){
            if(s1.equals(s2)){
                System.out.println("동등한 객체입니다.");
            } else {
                System.out.println("데이터가 다르기 때문에 동등하지 않습니다.");
            }
        } else {
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }
    }
}
