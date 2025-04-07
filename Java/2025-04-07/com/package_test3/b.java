package com.package_test3;

public class b {
    public void method(){
        a a = new a();

        //필드값 변경
        a.field1 = 1; //public
        a.field2 = 1; //default
        //a.field3 = 1; private

        //메소드 호출
        a.method1();
        a.method2();
        //a.method3(); private
    }
}
