//클래스 호출
package 챕터6문제풀이;

public class j15 {
    public static void main(String[] args){
        memberservice mymember = new memberservice();
        boolean result = mymember.login("hong", "12345");

        if(result){
            System.out.println("로그인 되었습니다.");
            mymember.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
