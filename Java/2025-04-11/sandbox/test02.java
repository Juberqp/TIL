package sandbox;

interface Chargeable{
    void charge();
}

interface Connectable{
    void connectToWiFi();
}

class SmartPhone implements Chargeable, Connectable{
    public void charge(){
        System.out.println("스마트폰을 충전 중입니다.");
    }

    public void connectToWiFi(){
        System.out.println("스마트폰이 WiFi에 연결되었습니다.");
    }
}

class Tablet implements Chargeable, Connectable{
    public void charge(){
        System.out.println("태블릿을 충전 중입니다.");
    }

    public void connectToWiFi(){
        System.out.println("태블릿이 WiFi에 연결되었습니다.");
    }
}

public class test02 {
    public static void main(String[] args){
        Chargeable[] c1 = {new SmartPhone(), new Tablet()};
        for(Chargeable i : c1) i.charge();

        Connectable[] c2 = {new SmartPhone(), new Tablet()};
        for(Connectable i : c2) i.connectToWiFi();


    }
}
