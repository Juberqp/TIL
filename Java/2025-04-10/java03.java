
interface Service{
    //디폴트 메소드
    default void defaultmethod1(){
        System.out.println("defaultmethod1 종속 코드");
        defaultCommon();
    }

    default void defaultmethod2(){
        System.out.println("defaultmethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("defaultmethod 중복 코드 A");
        System.out.println("defaultmethod 중복 코드 B");
    }

    //static 메소드
    static void staticmethod1(){
        System.out.println("staticmethod1 종속 코드");
        staticCommon();
    }

    static void staticmethod2(){
        System.out.println("staticmethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticmethod 중복 코드 A");
        System.out.println("staticmethod 중복 코드 B");
    }
}

class ServiceImpl implements Service{
}

public class java03 {
    public static void main(String[] args){
        //인터페이스 변수 선언과 구현 객체 대입
        Service service = new ServiceImpl();

        service.defaultmethod1();
        System.out.println();
        service.defaultmethod2();
        System.out.println();

        Service.staticmethod1();
        System.out.println();
        Service.staticmethod2();
        System.out.println();
    }
}
