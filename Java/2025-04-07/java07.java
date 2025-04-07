//getter/setter 기법
//값의 무결성이 깨지지 않게 설정함
public class java07 {
    public static void main(String[] args){
        //객체 생성
        car mycar = new car();

        //잘못된 값
        mycar.setspeed(-50);
        System.out.println(mycar.getspeed());

        //올바름
        mycar.setspeed(60);
        System.out.println(mycar.getspeed());

        if(!mycar.isstop()){
            mycar.setstop(true);
        }
        System.out.println(mycar.getspeed());
    }
}
