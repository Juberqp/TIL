//익명 구현 객체
interface RemoteControl{
    //추상 메소드
    void turnOn();
    void turnOff();
}

class Home{
    private RemoteControl rc = new RemoteControl(){
        @Override
        public void turnOn(){
            System.out.println("TV를 켭니다.");
        }
        @Override
        public void turnOff(){
            System.out.println("TV를 끕니다.");
        }
    };

    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    public void use2(){
        RemoteControl rc = new RemoteControl(){
            @Override
            public void turnOn(){
                System.out.println("에어컨을 켭니다.");
            }
            @Override
            public void turnOff(){
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }
}

public class java12 {
    public static void main(String[] args){
        Home home = new Home();

        //익명 구현 객체 필드
        home.use1();

        //익명 구현 로컬 변수
        home.use2();

        //익명 구현 매개 변수
        home.use3(new RemoteControl() {
            @Override
            public void turnOn(){
                System.out.println("난방을 켭니다.");
            }
            @Override
            public void turnOff(){
                System.out.println("난방을 끕니다.");
            }
        });
    }
}
