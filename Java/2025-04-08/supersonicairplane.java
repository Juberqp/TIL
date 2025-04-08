//airplane 상속
public class supersonicairplane extends airplane {
    //상수
    public static final int nomel = 1;
    public static final int supersonic = 2;

    public int flymode = nomel;

    //메소드 오버라이딩
    @Override
    public void fly(){
        if (flymode == supersonic){
            System.out.println("초음속 비행입니다.");
        } else {
            //airplane의 fly() 실행함
            super.fly();
        }
    }

}
