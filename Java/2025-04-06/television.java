public class television {
    int count = 0;

    static String company = "Mycompany";
    static String model = "LED";
    static String info;

    //클래스를 여러번 호출해도 정적 블록은 처음 한번만 실행됨.
    //객체 없이 실행되기 때문에 인스턴스, this 사용 불가
    static {
        //count = 1; 인스턴스 멤버 오류남
        //해결
        television mytev = new television();
        mytev.count = 1;

        info = company + "-" + model;
    }
}
