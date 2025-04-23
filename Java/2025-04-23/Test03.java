//스레드풀
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DocumentManager{
    private String[] docArray = new String[100];
    private int num = 0;

    public int getnum(){
        return num;
    }
    
    synchronized void save(String docName){
        System.out.println(Thread.currentThread().getName() + " 문서 저장 중: "+docName);
        docArray[num] = docName;
        num++;
    }
}

class Autosave implements Runnable{
    private DocumentManager manager;

    Autosave(DocumentManager manager){
        this.manager = manager;
    }
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(100);
                System.out.println("[AutoSave] 문서 "+manager.getnum()+"개 자동 백업됨");
            } catch (InterruptedException e){
                break;
            }
        }
    }
}

class UserThread implements Runnable{
    private String docName;
    private DocumentManager manager;

    UserThread(String docName, DocumentManager manager){
        this.docName = docName;
        this.manager = manager;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " 문서 수정 요청: " + docName);
        manager.save(docName);
    }
}

public class Test03 {
    public static void main(String[] args){
        DocumentManager manager = new DocumentManager();

        Autosave as = new Autosave(manager);
        Thread autosave = new Thread(as);
        autosave.setDaemon(true);
        autosave.start();

        ExecutorService pool = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 100; i++) {
            String text = "문서-"+i;
            pool.execute(new UserThread(text, manager));
        }

        pool.shutdown();
    }
}
