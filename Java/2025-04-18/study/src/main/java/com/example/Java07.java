package com.example;

//제네릭 메소드
class Sss <A>{
    A num;

    //클래스와 같은 제네릭일 경우 메소드가 우선된다.
    <A> void test1(A num){
        A n = num;
        System.out.println(n);
    }

    <B> void test2(B num){
        B n = num;
        System.out.println(n);
    }
}

public class Java07 {
    public static void main(String[] args){
        Sss s = new Sss();
        s.test1("문자");
        s.test2(10);
    }
}
