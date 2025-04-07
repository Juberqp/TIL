public class singleton {
    //private로 정적 필드 초기화
    private static singleton Singleton = new singleton();

    //new로 객체 만드는걸 금지
    private singleton(){
    }

    public static singleton getInstance() {
        return Singleton;
    }
}
