//객체 문자 정보
package com.example;

class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os){
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString(){
        return company+", "+os;
    }
}

public class Java08 {
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone("삼성전자", "안드로이드");

        String obj = sp.toString();
        System.out.println(obj);
        
        System.out.println(sp);
        //왜 실행되는가?
        //System.out.println 는 () 안에 있는 내용이 Object 라면
        //toString() 메소드 호출
        //toString() 가 호출되면서 오버라이딩 된 메소드 return 됨
    }
}
