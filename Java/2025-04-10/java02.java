//인터페이스 기초
//디폴트 메소드
//정적
interface remote2{
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn(); //public abstract 상태
    void turnOff();
    void setVolume(int volume);

    default void mute(boolean mute){
        if(mute == true){
            System.out.println("음소거 합니다.");
        } else {
            System.out.println("음소거를 해제 합니다.");
        }
    }

    //정적 메소드
    static void changeBattery(){
        System.out.println("리모컨 건전지를 교체합니다.");
    }
}

class tv2 implements remote2{
    private int volume = 0;

    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
        if(volume > remote2.MAX_VOLUME){
            this.volume = remote2.MAX_VOLUME;
        } else if(volume < remote2.MIN_VOLUME){
            this.volume = remote2.MIN_VOLUME;
        } else{
            this.volume = volume;
        }

        System.out.println("현재 시스템 볼륨: "+this.volume);
    }
}

class audio2 implements remote2{
    private int volume = 0;

    @Override
    public void turnOn(){
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
        if(volume > remote2.MAX_VOLUME){
            this.volume = remote2.MAX_VOLUME;
        } else if(volume < remote2.MIN_VOLUME){
            this.volume = remote2.MIN_VOLUME;
        } else{
            this.volume = volume;
        }

        System.out.println("현재 시스템 볼륨: "+this.volume);
    }

    private int memory_volume = 0;

    public void mute(boolean mute){
        if(mute == true){
            System.out.println("음소거 합니다.");
            memory_volume = this.volume;
        } else {
            System.out.println("음소거를 해제 합니다.");
            setVolume(this.memory_volume);
        }
    }

}

public class java02 {
    public static void main(String[] args){
        remote2 t = new tv2();
        remote2 a = new audio2();

        t.turnOn();
        t.setVolume(5);
        t.mute(true);
        t.mute(false);
        t.turnOff();
        System.out.println();

        a.turnOn();
        a.setVolume(5);
        a.mute(true);
        a.mute(false);
        a.turnOff();

        remote2.changeBattery(); //정적 메소드
    }
}