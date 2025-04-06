//return 응용
public class java03 {
    public static void main(String[] args){
        car mycar = new car();

        //메소드 호출로 가스 지정
        mycar.setcar(5);

        if(mycar.isLeftgas()){
            System.out.println("출발합니다.");
            mycar.run();
        }

        System.out.println("가스를 주입해주세요.");
    }
}
