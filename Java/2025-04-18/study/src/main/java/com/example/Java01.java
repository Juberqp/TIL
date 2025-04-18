//어노테이션
package com.example;

import java.lang.annotation.*;
import java.lang.reflect.Method;

//설정
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Food{
    String i() default "감자";
}

class Eat{
    String i;

    @Food(i = "고구마")
    public void eat(){
        System.out.println(i);
    }

    public void init() {
        //직접 값 주입
        try {
            Method method = this.getClass().getMethod("eat");
            if (method.isAnnotationPresent(Food.class)) {
                Food food = method.getAnnotation(Food.class);
                this.i = food.i();  // 어노테이션 값 주입!
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Java01 {
    public static void main(String[] args){
        System.out.println("배고프다...");

        Eat e = new Eat();
        e.init();
        e.eat();
        
    }
}
