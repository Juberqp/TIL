//부모 자식 상속
public class java01{
    public static void main(String[] args){
        smartphone myphone = new smartphone("갤럭시", "은색");

        //상속 받음
        System.out.println("모델: "+myphone.model);
        System.out.println("색깔: "+myphone.color);

        //smartphone의 고유 메소드
        System.out.println("와이파이 상태: "+myphone.wifi);

        //상속 받음
        myphone.bell();
        myphone.sendVoice("여보세요.");
        myphone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
        myphone.sendVoice("아~ 네, 반갑습니다.");
        myphone.hangup();

        //smartphone의 고유 메소드
        myphone.setwifi(true);
        myphone.internet();
    }
}