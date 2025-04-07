//싱글톤
//단 1개의 객체 / new로 여러개 못 만듬
public class java08 {
    public static void main(String[] args){
        //동적 방식 금지
        //singleton mtsing = new singleton(); 싱글톤으로 생성 막음

        //정적 메소드 호출로 객체를 얻음
        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }
    }
}
