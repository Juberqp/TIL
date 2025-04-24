//Vector
//멀티 스레드를 위한 List
//구닥다리, 잘 안씀
import java.util.List;
import java.util.Vector;

class Board2{
    private String subject;
    private String content;
    private String writer;

    public Board2(String subject, String content, String writer){
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    String getsub (){ return subject;}
    void setsub(String subject){ this.subject=subject; }

    String getcon (){ return content;}
    void setcon(String content){ this.content=content; }

    String getwri (){ return writer;}
    void setwri(String writer){ this.writer=writer; }
}

public class Java02 {
    public static void main(String[] args){
        //Vector
        //자동으로 Synchronized 됨
        List<Board2> list = new Vector<>();

        Thread threadA = new Thread(){
            @Override
            public void run(){
                for(int i=1; i<=1000; i++){
                    list.add(new Board2("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        Thread threadB = new Thread(){
            @Override
            public void run(){
                for(int i=1001; i<=2000; i++){
                    list.add(new Board2("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try{
            threadA.join();
            threadB.join();
        } catch(Exception e){}

        System.out.println("저장된 객체 수: "+list.size());
    }
}
