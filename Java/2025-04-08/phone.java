public class phone {
    //필드 선언
    public String model;
    public String color;

    //메소드
    public void bell(){
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message){
        System.out.println("자기: "+message);
    }

    public void receiveVoice(String message){
        System.out.println("상대방: "+message);
    }

    public void hangup(){
        System.out.println("전화를 끊습니다.");
    }
}
