public class calculator {
    //리턴값 없음
    void poweron(){
        System.out.println("시스템을 켭니다.");
    }
    void poweroff(){
        System.out.println("시스템을 끕니다.");
    }

    //리턴값 있음
    int plus(int x, int y){
        int r = x + y;
        return r;
    }
    double divide(int x, int y){
        double r = (double)x / (double)y;
        return r;
    }

    //오버로딩
    double rectangle(double width){
        return width * width; //정사각형
    }
    double rectangle(double width, double height){
        return width * height; //직사각형
    }
}
