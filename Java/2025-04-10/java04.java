//다중상속
interface RemoteControl{
    //추상 메소드
    void turnon();
    void turnoff();
}

interface Searchable{
    //추상 메소드
    void search(String url);
}

class SmartTv implements RemoteControl, Searchable{
    @Override
    public void turnon(){
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnoff(){
        System.out.println("TV를 끕니다.");
    }
    @Override
    public void search(String url){
        System.out.println(url+"를 검색합니다.");
    }
}

public class java04 {
    public static void main(String[] args){
        //SmartTv의 인터페이스 RemoteControl에 대입
        RemoteControl rc = new SmartTv();
        rc.turnon();
        rc.turnoff();

        //SmartTv의 인터페이스 Searchable에 대입
        Searchable sc = new SmartTv();
        sc.search("https://www.youtube.com");
    }
}
