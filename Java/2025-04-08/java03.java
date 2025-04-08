//메소드 오버라이딩
public class java03 {
    public static void main(String[] args){
        int r = 10;

        calculator mycalc = new calculator();
        System.out.println("원의 넓이: "+mycalc.areacircle(r));
        System.out.println();

        //calculator 를 상속 받았지만 오버라이딩으로 수정해서 사용함
        computer mycom = new computer();
        System.out.println("원의 넓이: "+mycom.areacircle(r));
    }
}
