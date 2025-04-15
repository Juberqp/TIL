//hashcode + equals 와 hashset의 차이?
//hashset은 객체를 중복 저장하지 않는다.
package com.example;

import java.util.HashSet;

public class Java07 {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 해쉬 수: "+hashSet.size());

        //동등 객체는 저장되지 않음
        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        System.out.println("저장된 해쉬 수: "+hashSet.size());

        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 해쉬 수: "+hashSet.size());
    }
}
