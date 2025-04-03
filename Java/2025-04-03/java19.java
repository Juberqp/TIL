public class java19 {
    public static void main(String[] args){
        kill:for(char upper = 'A'; upper<='Z'; upper++){
            for(char lower = 'a'; lower<='z'; lower++){
                System.out.println(upper + "-" + lower);
                if(lower == 'g'){
                    break kill;
                }
            }
        }

        System.out.println("프로그램 종료");
    }
}
