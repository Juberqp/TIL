public class java10 {
    public static void main(String[] args){
        char g = 'B';

        switch(g){
            case 'A':
            case 'a':
                System.out.println("우수 회원 입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }

        //또는
        switch(g){
            case 'A', 'a' -> {
                System.out.println("우수 회원 입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원 입니다.");
            }
            default -> {
                System.out.println("손님 입니다.");
            }
        }

        //또는
        switch(g){
            case 'A', 'a' -> System.out.println("우수 회원 입니다.");
            case 'B', 'b' -> System.out.println("일반 회원 입니다.");
            default -> System.out.println("손님 입니다.");
        }

    }
}
