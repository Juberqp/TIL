//ArrayList
//자주 사용하는 기능
import java.util.List;
import java.util.ArrayList;

class Board{
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer){
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

public class Java01 {
    public static void main(String[] args){
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        //사이즈
        int size = list.size();
        System.out.println("총 객체 수: "+size);
        System.out.println();

        //특정 인덱스
        Board board = list.get(2);
        System.out.printf("%s %s %s\n", board.getsub(), board.getcon(), board.getwri());
        System.out.println();

        //모든 객체 가져오기
        for(int i=0; i<list.size(); i++){
            Board b = list.get(i);
            System.out.printf("%s %s %s\n", b.getsub(), b.getcon(), b.getwri());
        }
        System.out.println();

        //객체 삭제
        list.remove(2); //2번 인덱스 삭제
        list.remove(2); //2번이 삭제되면서 3번이 2번으로 들어감
        for(int i=0; i<list.size(); i++){
            Board b = list.get(i);
            System.out.printf("%s %s %s\n", b.getsub(), b.getcon(), b.getwri());
        }
    }
}
