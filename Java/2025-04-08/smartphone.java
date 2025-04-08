public class smartphone extends phone {
    //필드 생성
    public boolean wifi;

    //생성자
    public smartphone(String model, String color){
        super(); //생략시 자동 생성
        this.model = model;
        this.color = color;
    }

    //메소드
    public void setwifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
