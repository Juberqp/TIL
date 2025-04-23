//스레드 이름 변경
public class Java04 {
    public static void main(String[] args){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"실행");

        //이름 안정함
        for(int i=0; i<3; i++){
            Thread threadA = new Thread() {
                @Override
                public void run(){
                    System.out.println(getName());
                }
            };
            threadA.start();
        }

        //이름 지정
        Thread chatthread = new Thread() {
            @Override
            public void run(){
                System.out.println(getName());
            }
        };
        chatthread.setName("채팅");
        chatthread.start();
    }
}
