//인터페이스 기초
//디폴트 메소드
//동적
interface remote{
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
}

class tv implements remote{
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
        if(volume > remote.MAX_VOLUME){
            this.volume = remote.MAX_VOLUME;
        } else if(volume < remote.MIN_VOLUME){
            this.volume = remote.MIN_VOLUME;
        } else{
            this.volume = volume;
        }

        System.out.println("현재 시스템 볼륨: "+this.volume);
    }
}

class audio implements remote{
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
        if(volume > remote.MAX_VOLUME){
            this.volume = remote.MAX_VOLUME;
        } else if(volume < remote.MIN_VOLUME){
            this.volume = remote.MIN_VOLUME;
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

public class java01 {
    public static void main(String[] args){
        remote t = new tv();
        remote a = new audio();

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
    }
}
