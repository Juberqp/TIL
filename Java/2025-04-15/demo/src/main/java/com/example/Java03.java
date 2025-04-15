//사용자 정의 예외
package com.example;

//예외는 클래스니까 상속이 가능하여
//원하는 메시지로 변경 가능
class MyException extends Exception{
    MyException(){
        super("기본 오류!");
    }

    MyException(String message){
        super(message);
    }
}

public class Java03 {
    public static void main(String[] args){
        try{
            throw new MyException("아자!");
        } catch (MyException e){
            System.out.println("예외: "+ e.getMessage());
        }
    }
}
