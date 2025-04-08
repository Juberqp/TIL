public class computer extends calculator {
    @Override //생략 가능
    public double areacircle(double r){
        System.out.println("원의 넓이 구하기");
        return Math.PI * r * r;
    }
}
