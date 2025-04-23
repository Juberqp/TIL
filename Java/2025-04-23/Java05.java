//데몬 스레드
class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                break;
            }
            save();
        }
    }
}

public class Java05 {
    public static void main(String[] args){
        AutoSaveThread ast = new AutoSaveThread();
        ast.setDaemon(true);
        ast.start();

        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
        }

        System.out.println("시스템 종료");
        //main 스레드 종료 되면 deamon 스레드도 종료 됨
    }
}
