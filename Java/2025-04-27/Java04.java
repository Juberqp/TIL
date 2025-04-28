//큐
import java.util.Queue;
import java.util.LinkedList;

class Message{
    String command;
    String to;

    Message(String command, String to){
        this.command = command;
        this.to = to;
    }
}

public class Java04 {
    public static void main(String[] args){
        Queue<Message> queue = new LinkedList<>();

        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKakaotalk", "김자바"));

        while(!queue.isEmpty()){
            Message m = queue.poll();

            switch(m.command){
                case "sendMail":
                    System.out.println(m.to+"에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(m.to+"에게 SMS을 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(m.to+"에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}
