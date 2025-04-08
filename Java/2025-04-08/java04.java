//슈퍼 메소드
public class java04 {
    public static void main(String[] args){
        supersonicairplane ssap = new supersonicairplane();

        ssap.takeoff();
        ssap.fly();

        //static
        ssap.flymode = supersonicairplane.supersonic;
        ssap.fly();
        ssap.flymode = supersonicairplane.nomel;

        //초음속이 아니여서 airplane의 fly 실행됨
        ssap.fly();
        ssap.land();
    }
}
