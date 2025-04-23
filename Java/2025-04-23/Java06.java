//스레드풀

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java06 {
    public static void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            int taskNum = i;
            pool.execute(() -> {
                System.out.println("Task " + taskNum + " handled by " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();

    }
}
