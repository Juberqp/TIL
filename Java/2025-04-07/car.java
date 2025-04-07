public class car {
    //필드
    private int speed;
    private boolean stop;

    //speed 필드의 getter/setter 선언
    public int getspeed(){
        return speed;
    }

    public void setspeed(int speed){
        if(speed < 0){
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public boolean isstop(){
        return stop;
    }

    public void setstop(boolean stop){
        this.stop = stop;
        if(stop == true) this.speed = 0;
    }
}
