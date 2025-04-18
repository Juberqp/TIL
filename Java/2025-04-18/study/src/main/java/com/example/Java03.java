//여러개의 제네릭 타입
package com.example;

class Cook <A, B>{
    private A str;
    private B num;

    Cook(A str, B num){
        this.str = str;
        this.num = num;
    }

    //메소드 타입을 제네릭으로
    A strgetter(){
        return str;
    }

    B numgetter(){
        return num;
    }

    void message(){
        System.out.printf("주문하신 %s, 총 %d개 나왔습니다.\n", str, num);
    }
}

public class Java03 {
    public static void main(String[] args){
        Cook<String, Integer> f = new Cook<String, Integer>("스파게티", 20);
        f.message();

        System.out.println(f.strgetter());
        System.out.println(f.numgetter());
    }
}
