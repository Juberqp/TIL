//추상 클래스
abstract class Phone{
    String owner;

    Phone(String owner){
        this.owner = owner;
    }

    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}

class SmartPhone extends Phone{
    SmartPhone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷을 검색합니다.");
    }
}

public class java06 {
    public static void main(String[] args){
        SmartPhone smartphone = new SmartPhone("홍길동");

        smartphone.turnOn();
        smartphone.internetSearch();
        smartphone.turnOff();
    }
}
