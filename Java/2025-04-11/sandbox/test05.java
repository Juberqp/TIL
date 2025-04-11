package sandbox;

interface PowerDevice{
    void turnOn();
    void turnOff();
}

class Smartphone implements PowerDevice{
    @Override
    public void turnOn(){
        System.out.println("스마트폰을 켭니다.");
    }
    @Override
    public void turnOff(){
        System.out.println("스마트폰을 끕니다.");
    }
}
class Laptop implements PowerDevice{
    @Override
    public void turnOn(){
        System.out.println("노트북을 켭니다.");
    }
    @Override
    public void turnOff(){
        System.out.println("노트북을 끕니다.");
    }
}
class TV implements PowerDevice{
    @Override
    public void turnOn(){
        System.out.println("TV을 켭니다.");
    }
    @Override
    public void turnOff(){
        System.out.println("TV을 끕니다.");
    }
}

public class test05 {
    public static void main(String[] args){
        PowerDevice[] p = {
            new Smartphone(),
            new Laptop(),
            new TV(),
        };

        for(PowerDevice i : p){
            i.turnOn();
            i.turnOff();
        }
    }
}
