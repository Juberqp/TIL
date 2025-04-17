//StringBuilder 클래스
//String 경우 새로운 객체 생성시 이전 객체는 버려짐 = 비효율적
//성능이 필요할때 사용
package com.example;

public class Java08 {
    public static void main(String[] args){
        //String은 불변 즉 변수의 값이 바뀔때마다 새 객체를 생성 후 예전 객체 버림
        //StringBuilder는 가변, 항상 같은 객체에 값만 바뀜
        String data = new StringBuilder()
            .append("DEF")
            .insert(0, "ABC")
            .delete(3, 4)
            .toString();//메소드 체이닝 패턴
        System.out.println(data);
    }
}
