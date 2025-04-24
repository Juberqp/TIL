//멀티 스레드
class AlarmThread extends Thread{
    private String name;
    private int sec;

    AlarmThread(String name, int sec){
        this.name = name;
        this.sec = sec;
    }

    @Override
    public void run(){
        try{
            while(true){
                Thread.sleep(sec*1000);
                System.out.printf("%s: [%s] 알람 울림!\n", Thread.currentThread().getName(), name);
            }
        } catch(InterruptedException e){
        }
    }
}

public class Test01{
    public static void main(String[] args){
        AlarmThread a1 = new AlarmThread("알람A", 3);
        AlarmThread a2 = new AlarmThread("알람B", 5);
        AlarmThread a3 = new AlarmThread("알람C", 1);

        a1.setDaemon(true);
        a2.setDaemon(true);
        a3.setDaemon(true);

        a1.start();
        a2.start();
        a3.start();

        try{ Thread.sleep(10000); } catch(InterruptedException e){}
    }
}