public class car {
    //필드 선언
    public int speed;

    //메소드 선언
    public void speedup(){
        speed += 1;
    }

    //fianl 메소드
    public final void stop(){
        System.out.println("차를 멈춤");
    }
}
