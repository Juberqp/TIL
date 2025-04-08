//super 설정
public class java02 {
    public static void main(String[] args){
        smartphone2 myphone = new smartphone2("갤럭시", "은색");

        //상속 필드
        System.out.println("모델: "+myphone.model);
        System.out.println("색깔: "+myphone.color);
    }
}
