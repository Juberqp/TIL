/*
중첩 클래스, 중첩 인터페이스, 익명 객체 등 다양한 개념을 활용해 볼 수 있는 코딩 문제

문제: 스마트 홈 시스템 시뮬레이션

요구사항:

스마트 홈 시스템의 일부를 Java로 시뮬레이션하는 프로그램을 작성하세요. 이 시스템은 중앙 허브(SmartHomeHub)와 허브에 연결된 장치(조명 Light, 온도 조절기 Thermostat)를 관리합니다. 다음 요구사항을 만족하도록 코드를 작성해야 합니다.

SmartHomeHub 클래스 (Outer Class):

hubName (String): 허브의 이름.
isConnected (boolean): 허브의 인터넷 연결 상태.
생성자: hubName을 초기화하고 isConnected를 true로 설정합니다.
displayStatus(): 허브 이름과 연결 상태를 출력합니다.
Light 클래스 (Instance Member Class):

SmartHomeHub 내부에 인스턴스 멤버 클래스로 정의합니다.
location (String): 조명이 설치된 위치 (예: "거실", "침실").
isOn (boolean): 조명의 현재 상태 (켜짐/꺼짐).
생성자: location을 초기화하고 isOn을 false로 설정합니다.
turnOn(): 조명을 켭니다 (isOn = true). 메시지 출력 시 바깥 SmartHomeHub의 hubName에 접근하여 "[허브이름] 허브를 통해 [위치] 조명을 켭니다." 형식으로 출력합니다.
turnOff(): 조명을 끕니다 (isOn = false). 유사한 메시지를 출력합니다.
getStatus(): 현재 조명 상태("켜짐" 또는 "꺼짐")를 문자열로 반환합니다.
DeviceCounter 클래스 (Static Member Class):

SmartHomeHub 내부에 정적 멤버 클래스로 정의합니다.
connectedDevices (static int): 허브에 연결된 총 장치 수 (정적 변수).
incrementCount() (static): connectedDevices 수를 1 증가시킵니다.
getCount() (static): 현재 connectedDevices 수를 반환합니다.
참고: 이 클래스는 특정 SmartHomeHub 인스턴스에 종속되지 않습니다.
runDiagnostic 메소드 (Outer Class Method):

SmartHomeHub 클래스 내부에 메소드를 정의합니다.
이 메소드 내부에 로컬 클래스 NetworkChecker를 정의합니다.
NetworkChecker 클래스는 checkConnection() 메소드를 가집니다.
checkConnection() 메소드는 바깥 SmartHomeHub의 isConnected 필드에 접근하여 연결 상태를 확인하고, "네트워크 진단: 연결 상태 양호." 또는 "네트워크 진단: 연결 확인 필요." 메시지를 출력합니다. 또한, runDiagnostic 메소드에 전달된 파라미터(예: diagnosticLevel, final 또는 effectively final)에 접근하여 출력할 수 있습니다. (예: "진단 레벨: [레벨]")
runDiagnostic 메소드는 NetworkChecker 객체를 생성하고 checkConnection()을 호출합니다.
EventHandler 인터페이스 (Nested Interface):

SmartHomeHub 클래스 내부에 중첩 인터페이스로 정의합니다.
onEvent(String eventType, String details) 추상 메소드를 가집니다. 이 메소드는 특정 이벤트 발생 시 호출됩니다.
triggerEmergencyAlert 메소드 (Outer Class Method):

SmartHomeHub 클래스 내부에 메소드를 정의합니다.
이 메소드는 emergencyMessage (String)을 파라미터로 받습니다.
메소드 내에서 EventHandler 인터페이스를 구현하는 익명 객체(Anonymous Inner Class) 를 생성하고 즉시 onEvent 메소드를 호출합니다.
onEvent 구현: "긴급 알림!" 메시지와 함께 전달받은 emergencyMessage를 출력합니다. 또한, 바깥 SmartHomeHub의 hubName에 접근하여 "([허브이름]에서 발송)" 형식으로 덧붙여 출력합니다.
구현 가이드:

main 메소드에서 SmartHomeHub 객체를 생성합니다.
해당 허브의 Light 객체를 여러 개 생성하고 (예: 거실 조명, 침실 조명), 생성할 때마다 DeviceCounter.incrementCount()를 호출합니다.
조명 몇 개를 켜고 상태를 확인합니다.
현재 연결된 장치 수를 DeviceCounter.getCount()를 통해 출력합니다.
runDiagnostic 메소드를 호출하여 네트워크 진단을 수행합니다 (진단 레벨과 같은 파라미터를 넘겨 보세요).
triggerEmergencyAlert 메소드를 호출하여 긴급 알림을 시뮬레이션합니다.
마지막으로 허브의 상태를 displayStatus()로 출력합니다.
*/

package test;

import test.SmartHomeHub.DeviceCounter;

class SmartHomeHub{
    String hubName;
    boolean isConnected;

    SmartHomeHub(String hubName){
        this.hubName = hubName;
        this.isConnected = true;
    }

    void displayStatus(){
        System.out.println("허브 이름: "+hubName);
        System.out.println("연결 상태: "+isConnected);
    }

    class Light{
        String location;
        boolean isOn;

        Light(String location){
            this.location = location;
            this.isOn = false;
        }

        void turnOn(){
            this.isOn = true;
            System.out.println(hubName+" 허브를 통해 "+this.location+" 조명을 켭니다.");
        }

        void turnOff(){
            this.isOn = false;
            System.out.println(hubName+" 허브를 통해 "+this.location+" 조명을 끕니다.");
        }

        void getStatus(){
            if(this.isOn){
                System.out.println("켜짐");
            } else {
                System.out.println("꺼짐");
            }
        }
    }

    static class DeviceCounter{
        static int connectedDevices=0;

        static void incrementCount(){
            connectedDevices += 1;
        }

        static int getCount(){
            return connectedDevices;
        }
    }

    void runDiagnostic(){
        class NetworkChecker{
            void checkConnection(){
                if(isConnected){
                    System.out.println("네트워크 진단: 연결 상태 양호.");
                } else {
                    System.out.println("네트워크 진단: 연결 확인 필요.");
                }
            }
        }

        NetworkChecker n = new NetworkChecker();
        n.checkConnection();
    }

    interface EventHandler{
        void onEvent(String eventType, String details);
    }

    void triggerEmergencyAlert(String emergencyMessage){
        EventHandler e = new EventHandler(){
            public void onEvent(String eventType, String details){
                System.out.println(eventType+" 긴급 알림! "+details);
            }
        };

        e.onEvent(hubName, emergencyMessage);
    }
}

public class test06 {
    public static void main(String[] args){
        //객체 생성
        SmartHomeHub[] s = {new SmartHomeHub("거실 조명"), new SmartHomeHub("침실 조명")};

        //객체 카운트
        for(SmartHomeHub i : s){
            DeviceCounter.incrementCount();
        }

        //장치 수
        System.out.println(DeviceCounter.getCount()+"개의 장치.");
        System.out.println();

        //네트워크 상태 확인
        for(SmartHomeHub i : s){
            i.runDiagnostic();
        }
        System.out.println();

        //긴급 알람
        for(SmartHomeHub i : s){
            i.triggerEmergencyAlert("[업데이트 필요.]");
        }
        System.out.println();

        //허브 상태
        for(SmartHomeHub i : s){
            i.displayStatus();
        }
        System.out.println();
    }
}
